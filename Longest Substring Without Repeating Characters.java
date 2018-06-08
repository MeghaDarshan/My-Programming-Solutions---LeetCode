/* Given a string, find the length of the longest substring without repeating characters.*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null ||s.length()==0)return 0;
        if(s.length()==1)return 1;
        HashSet<Character> set = new HashSet<Character>();
        //dabad
        int res = 0,i=0,j=0;
      while(j<s.length() && i<s.length()){
          if(set.contains(s.charAt(j))){
              set.remove(s.charAt(i));
              i++;
          }
          else{
              set.add(s.charAt(j));
              j++;
              if(j-i >res){res = j-i;}
          }
      }
        return res;
    }
}