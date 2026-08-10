class Solution {

    public String encode(List<String> strs) {
        StringBuilder string=new StringBuilder();
        for(String s : strs){
            string.append(s.length()).append("#").append(s);
        }
        return string.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> result=new ArrayList<>();
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            i=j+1;
            result.add(str.substring(i,i+length));
            i+=length;
        }
        return result;
    }
}
