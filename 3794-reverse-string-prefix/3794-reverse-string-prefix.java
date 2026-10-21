class Solution {
    public String reversePrefix(String s, int k) {
        String rev="";
        String rem="";
        for(int i=k-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        for(int i=k;i<s.length();i++){
            rem+=s.charAt(i);
        }
        return rev.concat(rem);
   }
}