class Solution {
    public String toLowerCase(String s) {
        String lowercase="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
            lowercase+=(char)(s.charAt(i)+32);
        }
        else{
            lowercase+=s.charAt(i);
        }
        }
        return lowercase;
    }
}