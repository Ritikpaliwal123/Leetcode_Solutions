class Solution {
    public int findClosest(int x, int y, int z) {
        int d=Math.abs(z-x);
        int diff=Math.abs(z-y);
        if(d<diff){
            return 1;
        }
        if(d>diff){
            return 2;
        } 
        return 0;

    }
}