/* Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)return "";
        for(int i=0;i<strs[0].length();i++){
            char prefix = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=prefix ){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}