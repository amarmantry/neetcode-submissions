class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left=1;
        int[] arr=new int[n];
        Arrays.fill(arr,1);
        for(int i=0;i<n;i++){
            left*=nums[i];
            if(i+1<n){
                arr[i+1]=left;
            }
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            right*=nums[i];
            if(i-1>=0){
                arr[i-1]*=right;
            }
        }
        return arr;
    }
}  
