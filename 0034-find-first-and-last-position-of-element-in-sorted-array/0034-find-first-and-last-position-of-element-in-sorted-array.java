class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int first=-1;
        int last=-1;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                first=mid;
                right=mid-1;
            }else if(target>nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                last=mid;
                start=mid+1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return new int[]{first,last};
    }
}
   