

public class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        int n = events.length;
        int[][] dp = new int[n + 1][k + 1];

        for (int i = n - 1; i >= 0; i--) {
            int nextIndex = findNext(events, i + 1, n - 1, events[i][1]);
            for (int j = 1; j <= k; j++) {
                dp[i][j] = Math.max(
                    dp[i + 1][j],
                    dp[nextIndex][j - 1] + events[i][2]
                );
            }
        }

        return dp[0][k];
    }

    private int findNext(int[][] events, int left, int right, int endDay) {
        int res = events.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (events[mid][0] > endDay) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}
