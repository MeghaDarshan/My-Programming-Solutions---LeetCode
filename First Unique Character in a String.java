/* Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.*/

class Solution {
    public int firstUniqChar(String s) {
        if(s==null || s.length()==0){
            return -1;
        }
        HashMap<Character, Integer> map= new HashMap<Character, Integer>();
        char[] res = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(res[i])){
                map.put(res[i],1);
            }
            map.put(res[i], map.get(res[i])+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.containsKey(res[i])){
                if(map.get(res[i])==2){
                    return i;
                }
            }
        }
        return -1;
    }
}