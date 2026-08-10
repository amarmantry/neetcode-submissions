class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Integer>[] buckets=new List[nums.length+1];
        map.forEach((num,freq)->{
            if(buckets[freq]==null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(num);
        });
        int[] result=new int[k];
        int count=0;
        for(int i=buckets.length-1;i>=0 && count<k;i--){
            if(buckets[i]!=null){
                for(int num : buckets[i]){
                    result[count++]=num;
                    if(count==k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
