class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum=0,digitsum=0;
        for(int i=0;i<nums.length;i++){
            elementsum+=nums[i];
        while(nums[i]!=0){
            int rem=nums[i]%10;
            digitsum+=rem;
            nums[i]=nums[i]/10;
        }
        }
        return elementsum-digitsum;
    }
}