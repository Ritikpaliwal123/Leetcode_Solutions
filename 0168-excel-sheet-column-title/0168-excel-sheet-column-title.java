class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str=new StringBuilder();
        int rem=0;
        while(columnNumber>0){
           columnNumber--;
        
        rem=columnNumber%26;
        str.append((char)(rem+'A'));
        columnNumber/=26;
        }
      return  str.reverse().toString();
        
    }
}