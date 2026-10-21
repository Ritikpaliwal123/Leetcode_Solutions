class Solution {
    public boolean checkGoodInteger(int n) {
        int squaresum=0;
        int digitsum=0;
        while(n>0){
            int rem=n%10;
            squaresum+=rem*rem;
            digitsum+=rem;
            n=n/10;
        }
        if(squaresum-digitsum >=50){
            return true;
        }
        return false;
    }
}