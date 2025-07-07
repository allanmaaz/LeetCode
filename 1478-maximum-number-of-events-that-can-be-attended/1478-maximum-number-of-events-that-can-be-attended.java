

public class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int day = 1;
        int i = 0;
        int n = events.length;
        int attended = 0;

        int lastDay = 0;
        for (int[] event : events) {
            lastDay = Math.max(lastDay, event[1]);
        }

        while (day <= lastDay) {
            while (i < n && events[i][0] == day) {
                minHeap.offer(events[i][1]);
                i++;
            }

            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            if (!minHeap.isEmpty()) {
                minHeap.poll();
                attended++;
            }

            day++;
        }

        return attended;
    }
}
