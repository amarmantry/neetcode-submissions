class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int max=0;
        int l=0;
        Set<Character> seen=new HashSet<>();
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            while(seen.contains(c)){
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(c);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
