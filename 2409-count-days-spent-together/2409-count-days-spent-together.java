class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String a1[]= arriveAlice.split("-");
        String a2[]= leaveAlice.split("-");
        String b1[]= arriveBob.split("-");
        String b2[]= leaveBob.split("-");
        int month1=Integer.parseInt(a1[0]);
        int day1=Integer.parseInt(a1[1]);
        int month2=Integer.parseInt(a2[0]); 
        int day2=Integer.parseInt(a2[1]);
        int month3=Integer.parseInt(b1[0]); 
        int day3=Integer.parseInt(b1[1]);
        int month4=Integer.parseInt(b2[0]); 
        int day4=Integer.parseInt(b2[1]);
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int total1=day1;
        for(int i=0;i<month1-1;i++){
            total1+=days[i];
        }
        int total2=day2;
        for(int i=0;i<month2-1;i++){
            total2+=days[i];
        }
         int total3=day3;
        for(int i=0;i<month3-1;i++){
            total3+=days[i];
        }
         int total4=day4;
        for(int i=0;i<month4-1;i++){
            total4+=days[i];
        }
        int start=Math.max(total1,total3);
        int end=Math.min(total2,total4);
        if(start>end){
            return 0;
        }
        int count=0;
        for(int i=start;i<=end;i++){
            count++;
        }
        return count;


    }
}