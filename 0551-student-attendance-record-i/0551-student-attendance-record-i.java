 class Solution {
   public boolean checkRecord(String s) {
//         int count=1,c=1;
//         for(int i=0;i<s.length()-1;i++){
//             if(s.charAt(i)=='A' && s.charAt(i+1)=='A'){
//                 c++;
//             }
//         }
//          for(int i=0;i<s.length()-2;i++){
//             if(s.charAt(i)=='L'&& s.charAt(i+1)=='L'&& s.charAt(i+2)=='L'){
//                    count++;
//             }
//         }
//         if(count==1 && c==1){
//             return true;
//         }
//         return false;
//     }
// }
    int aCount = 0;
    for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == 'A') {
                aCount++;
            }
             if(aCount >= 2) {
                return false;
            }
             if(i < s.length() - 2 && s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' &&
               s.charAt(i + 2) == 'L') {
                return false;
            }
        }
        return true;
    }
}