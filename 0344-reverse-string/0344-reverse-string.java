class Solution {
    public void reverseString(char[] s) {
     char [] rev= new char[s.length];
     for(int i=s.length-1,j=0;i>=0;i--,j++){
        rev[j]=s[i];
     }
     for(int i=0;i<s.length;i++){
        s[i]=rev[i];
     }
        
    }
}