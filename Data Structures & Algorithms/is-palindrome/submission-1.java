class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int l=0;
        int r=n-1;
        char[] c=s.toCharArray();
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(c[r])){
                r--;
            }
            while(l<r && !Character.isLetterOrDigit(c[l])){
                l++;
            }
            char a=Character.toLowerCase(c[l]);
            char b=Character.toLowerCase(c[r]);
            if(a!=b){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
