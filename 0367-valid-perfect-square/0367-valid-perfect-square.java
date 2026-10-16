class Solution {
    public boolean isPerfectSquare(int num) {
    int odd=1,n=0;
    while(num>0){
        num-=odd;
        odd+=2;
        n++;
    }
    if(num==0) return true;
    return false;

        
    }
}