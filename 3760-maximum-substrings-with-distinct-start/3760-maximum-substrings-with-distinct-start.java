class Solution {
    public int maxDistinct(String s) {
        int count=0;
        int freq[]=new int [256];
        for(int i=0;i<s.length();i++){
             freq[s.charAt(i)]++;
             }
             for(int i=0;i<256;i++){
                if(freq[i]>0){
                    count++;
                }
             }
        
        return count;
    }
}