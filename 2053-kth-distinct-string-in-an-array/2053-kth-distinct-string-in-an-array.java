class Solution {
    public String kthDistinct(String[] arr, int k) {
    String num[]=new String[k];
        int freq[]=new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            freq[i] = 1;
            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[i].equals(arr[j])){
                    freq[i]++;
                }
            }
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(freq[i]==1){
                num[j]=arr[i];
                j++;
            }
            if(j==k){
                return num[j-1];
    
            }
        }
        
        return "";
    }
}