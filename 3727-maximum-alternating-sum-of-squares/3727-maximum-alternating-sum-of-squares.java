class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
    nums[i]=nums[i]*nums[i];
}
Arrays.sort(nums);
    long sum=0,s=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length/2){
                s+=nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
        long ans=sum-s;
        return ans;
      
        
    }
}
