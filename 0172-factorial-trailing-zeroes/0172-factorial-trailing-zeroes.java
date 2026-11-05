class Solution {
    public int trailingZeroes(int n) {
//         long fact=1;
//         while(n!=0){
//           fact=fact*n;
//           n=n-1;
//         }
//         int count=0;
//         while(fact!=0){
//          long rem=fact%10;
//             if(rem==0){
//                 count++;
//             }
//             else{
//                 break;
//             }
//             fact=fact/10;
//         }
//         return count;
//     }
// }
int count=0;
while(n>0){
    n=n/5;
    count+=n;
}
return count;
    }
}