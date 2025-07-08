

public class Solution {

    public int maxValue(int[][] events, int k) {
        int numberOfEvents = events.length;

        Arrays.sort(events, (a, b) -> a[1] - b[1]);

        int[][] dp = new int[numberOfEvents + 1][k + 1];

        for (int eventIndex = 1; eventIndex <= numberOfEvents; eventIndex++) {
            int startDay = events[eventIndex - 1][0];
            int endDay = events[eventIndex - 1][1];
            int value = events[eventIndex - 1][2];

            int previousIndex = findPrevious(events, startDay);

            for (int allowed = 1; allowed <= k; allowed++) {
                int skip = dp[eventIndex - 1][allowed];
                int take = dp[previousIndex + 1][allowed - 1] + value;
                dp[eventIndex][allowed] = Math.max(skip, take);
            }
        }

        return dp[numberOfEvents][k];
    }

    private int findPrevious(int[][] events, int targetStart) {
        int low = 0;
        int high = events.length - 1;
        int answer = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (events[mid][1] < targetStart) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return answer;
    }
}
