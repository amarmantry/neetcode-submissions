class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String s : strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            map.computeIfAbsent(String.valueOf(c),k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
