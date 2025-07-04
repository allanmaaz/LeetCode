class Solution {
    public char kthCharacter(long k, int[] operations) {
        long n = 1;
        int i = 0;
        while (n < k) {
            n <<= 1;
            i++;
        }

        int shiftCount = 0;
        while (n > 1) {
            long half = n >> 1;
            if (k > half) {
                k -= half;
                shiftCount += operations[i - 1];
            }
            n = half;
            i--;
        }

        
        return (char) ('a' + (shiftCount % 26));
    }
}
