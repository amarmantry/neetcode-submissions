class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c=s.toCharArray();
        int n=c.length;
        if(n==0){
            return 0;
        }
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(!set.contains(c[i])){
                l++;
                max=Math.max(l,max);
                set.add(c[i]);
            }
            else{
                set.clear();
                i=i-l;
                l=0;
            }
        }
        return max;
    }
}
