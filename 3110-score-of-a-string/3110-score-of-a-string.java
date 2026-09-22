class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        // for(int i=0;i<s.length()-1;i++){
//         while(i<s.length()-1){
//             char ch=s.charAt(i);
//             // for(int j=i+1;j<s.length();j++){
//             //  int j=i+1;
//             //  while(j<s.length()){
//                 sum+=Math.abs(ch-s.charAt(i+1));
//             //      j++;
//             //  }
//         i++;
//         }
//         return sum;
//     }
// }
for(int i=0;i<s.length()-1;i++){
    sum+=Math.abs(s.charAt(i)-s.charAt(i+1));
    }
    return sum;
    }
}