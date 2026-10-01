// class Solution {
//     public boolean isValid(String s) {
//         int count=0;
//      for(int i=0;i<s.length();i++){
//         char ch=s.charAt(i);
//         if(ch=='(' || ch=='['|| ch=='{'){
//             count++;
//         }
//         if(ch==')'|| ch=='}'|| ch==']'){
//             count--;
//         }
//      } 
//      if(count==0){
//         return true;
//      }  
//      return false;
//     }
// }
class Solution {
    public boolean isValid(String s) {

        while (s.contains("()") ||
               s.contains("[]") ||
               s.contains("{}")) {

            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }

        return s.length() == 0;
    }
}