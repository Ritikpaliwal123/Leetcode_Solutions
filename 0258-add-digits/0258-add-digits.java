class Solution {
    public int addDigits(int num) {
        int rem=0;
        int n=num;
        if(n<10){
            return n;
        }
        while(n>=10){
            int sum=0;
            while(n!=0){
                rem=n%10;
                sum+=rem;
                n=n/10;
            }
        n=sum;
    }
    return n;
}
}