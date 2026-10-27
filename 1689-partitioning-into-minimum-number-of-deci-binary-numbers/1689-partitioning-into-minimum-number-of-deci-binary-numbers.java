class Solution {
    public int minPartitions(String n) {
//         int max=0;
//         int num=Integer.parseInt(n);
//         // while(num!=0){
//         //  int rem=num%10;
//         //  if(rem>max){
//         //     max=rem;
//         //  }
//         //  num=num/10;
//         // }
//         return max;
//     }
// }
// logic 2
int max=0;
for(int i=0;i<n.length();i++){
   max=Math.max(max,n.charAt(i)-'0');
}
return max;
    }
}