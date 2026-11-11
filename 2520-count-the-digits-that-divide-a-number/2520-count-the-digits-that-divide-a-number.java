class Solution {
    public int countDigits(int num) {
       int rem=0;
       int temp=num;
      int  countDigits=0;
        while(temp>0){
           rem=temp%10;
          if(num%rem==0 && rem!=0){
            countDigits++;
          }
          
          temp=temp/10;     
    }
    return countDigits;
}
}