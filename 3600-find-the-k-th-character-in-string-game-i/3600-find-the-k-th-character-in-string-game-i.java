class Solution {
    public char kthCharacter(int k) {
         
   
        StringBuilder sb = new StringBuilder("a");

        while (sb.length() < k) {
            int len = sb.length();
            for (int i = 0; i < len && sb.length() < k; i++) {
                sb.append(nextChar(sb.charAt(i)));
            }
        }

        return sb.charAt(k - 1);
    }

    private char nextChar(char ch) {
        return (ch == 'z') ? 'a' : (char)(ch + 1);
    }
}

 