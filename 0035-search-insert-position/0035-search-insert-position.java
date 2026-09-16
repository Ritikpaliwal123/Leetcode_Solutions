class Solution {
    public int searchInsert(int[] nums, int target) {
//   for(int i=0;i<nums.length;i++){
//     if(nums[i]>=target){
//         return i;
//     }
//   }
//   return nums.length;
//     }
// }
        int left = 0,right = nums.length;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]>=target){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}