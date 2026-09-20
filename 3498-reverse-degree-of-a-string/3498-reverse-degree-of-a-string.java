class Solution {
    public int reverseDegree(String s) {
        int sum=0;
           for(int j=0;j<s.length();j++){
                int value=26-(s.charAt(j)-'a');
                sum=sum+(value*(j+1));
            }
        
        return sum;
    }
}