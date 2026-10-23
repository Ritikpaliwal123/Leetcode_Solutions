class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int [m+n];
        for(int i=0;i<m;i++){
         arr[i]=nums1[i];
        } 
        for(int i=m;i<m+n;i++){
            arr[i]=nums2[i-m];
        }
        Arrays.sort(arr);
        double ans;
        int len=arr.length;
        if(len%2==0){
            ans=(arr[len/2]+arr[len/2-1])/2.0;

        }
        else{
            ans=arr[len/2];
        }
      
        return ans;
    }
}