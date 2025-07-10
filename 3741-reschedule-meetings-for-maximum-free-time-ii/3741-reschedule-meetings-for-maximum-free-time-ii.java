class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] gaps = new int[n + 1];
        gaps[0] = startTime[0];
        for (int i = 1; i < n; i++) {
            gaps[i] = startTime[i] - endTime[i - 1];
        }
        gaps[n] = eventTime - endTime[n - 1];

        int[] maxLeft = new int[n + 1];
        int[] maxRight = new int[n + 1];
        maxLeft[0] = gaps[0];
        for (int i = 1; i <= n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], gaps[i]);
        }
        maxRight[n] = gaps[n];
        for (int i = n - 1; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], gaps[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int duration = endTime[i] - startTime[i];
            int adjacent = gaps[i] + gaps[i + 1];
            int maxGap = Math.max(i > 0 ? maxLeft[i - 1] : 0, i + 2 <= n ? maxRight[i + 2] : 0);
            int extra = duration <= maxGap ? duration : 0;
            ans = Math.max(ans, adjacent + extra);
        }
        return ans;
    }
}
