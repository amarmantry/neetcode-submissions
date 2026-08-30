class Solution {
    public String minWindow(String s, String t) {
        int[] need=new int[128];
        int[] have=new int[128];
        int needCount=0;
        for(char c : t.toCharArray()){
            if(need[c]==0){
                needCount++;
            }
            need[c]++;
        }
        int l=0;
        int count=0;
        int minLen=Integer.MAX_VALUE;
        int startIndex=0;
        for(int r=0;r<s.length();r++){
            char rightChar=s.charAt(r);
            have[rightChar]++;
            if(need[rightChar]>0 && have[rightChar]==need[rightChar]){
                count++;
            }
            while(count==needCount){
                if(r-l+1<minLen){
                    startIndex=l;
                    minLen=r-l+1;
                }
                char leftChar=s.charAt(l);
                have[leftChar]--;
                if(need[leftChar]>0 && have[leftChar]<need[leftChar]){
                    count--;
                }
                l++;
            }
        }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(startIndex,startIndex+minLen);
    }
}
