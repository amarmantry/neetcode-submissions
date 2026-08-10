class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2){
            return false;
        }
        for(char c : s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
}
