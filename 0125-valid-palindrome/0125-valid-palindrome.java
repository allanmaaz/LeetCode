class Solution {
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        
        while(l<r){
            char cha1=s.charAt(l);
            char cha2=s.charAt(r);
            if(!AN(cha1)){
                l++;
                continue;
            }
             if(!AN(cha2)){
                r--;
                continue;
            }
            char lower1= toLower(cha1);
            char lower2= toLower(cha2);
            if(lower1!=lower2){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
    public boolean AN(char c){
        return (c >= 'A'&& c<='Z')||(c >= 'a'&& c<='z')||(c >= '0'&& c<='9');
    }
    public char toLower(char c){
        if(c>='A'&& c<='Z'){
            return (char)(c+32);
        }
        return c;
    }
}