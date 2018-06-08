/*Given two strings s and t , write a function to determine if t is an anagram of s.*/

class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.isEmpty() && t.isEmpty()){
           return true;
       }
        if(s.length()==0 && t.length()==0){
            return true;
        }
        if(s.length()!=t.length()){
            return false;
        }
        int[] array = new int[256];
        
        for(int i=0;i<s.length();i++){
            array[s.charAt(i)]++;
            array[t.charAt(i)]--;
        }
        
     
        for(int i: array){
            if(i!=0){
                return false;
            }
        }
        return true;
        
    }
}