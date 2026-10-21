class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int freq[]=new int[256];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int i=min;i<=max;i++){
         if(freq[i]==0){
            list.add(i);
         }
        }
         return list;
     } 
}