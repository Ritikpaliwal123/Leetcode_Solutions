class Solution {
    public int searchInsert(int[] nums, int target) {
//         int n=nums.length;
//         int index=0;
//         for(int i=0;i<n;i++){
//             if(nums[i]==target){
//                 return i;
//             }
//              }
//              for(int i=n-1;i>=0;i--){
//                 if(nums[i]<=target){
//                     index=n-i+1;
//                 }
//              }
//              return index;
//     }
// }
for(int i = 0; i < nums.length; i++) {

if(nums[i] >= target) {

return i;

}

}
return nums.length;

}
}