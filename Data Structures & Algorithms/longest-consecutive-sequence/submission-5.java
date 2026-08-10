class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n<=0){
            return 0;
        }
        int count=1;
        int max=1;
        Arrays.sort(nums);
        int current=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==current){
                continue;
            }
            if(nums[i]-1==current){
                count++;
                current=nums[i];
                max=Math.max(max,count);
            }
            else{
                current=nums[i];
                count=1;
            }
        }
        return max;
    }
}
