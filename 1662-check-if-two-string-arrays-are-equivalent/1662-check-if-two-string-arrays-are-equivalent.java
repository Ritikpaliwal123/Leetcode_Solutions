class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str="";
        String new2="";
        for(int i=0;i<word1.length;i++){
             str+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            new2+=word2[i];
        }
        if(str.equals(new2)){
            return true;
        }
        return false;
    }
}