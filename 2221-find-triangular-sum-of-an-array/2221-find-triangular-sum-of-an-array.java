class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        while(nums.length>1){
         int newnum[]=new int[nums.length-1];
         for(int i=0;i<newnum.length;i++){
            newnum[i]=(nums[i]+nums[i+1])%10;
         }
        
        nums= newnum;
        }
        return nums[0];
    }
}