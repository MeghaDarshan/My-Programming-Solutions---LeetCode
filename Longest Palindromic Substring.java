/* Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.*/

class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==1)return s;
        int len= s.length();
        String result= "";
       int maxlen = 0;
        boolean[][] dp =new boolean[len][len];
        
        for(int i=0; i<s.length();i++){
            for(int j=0;j<len-i;j++){
                int k = j+i;
                
                if(s.charAt(j)==s.charAt(k) && (k-j<=2||dp[j+1][k-1])){
                    dp[j][k]=true;
                    if(k-j+1>maxlen){
                maxlen = k-j+1;
                result = s.substring(j, k+1);
            }
                }
                 
            }
           
        }
        return result;
    }
}