class Solution {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] count=new int[26];
        int l=0;
        int maxFreq=0;
        int maxLen=0;
        for(int r=0;r<s.length();r++){
            int num=s.charAt(r)-'A';
            count[num]++;
            maxFreq=Math.max(maxFreq,count[num]);
            int cal=(r-l+1)-maxFreq;
            if(cal>k){
                count[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}