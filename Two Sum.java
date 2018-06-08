/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
       // if(nums==null || nums.length==0)return [0,0];
        HashMap<Integer,Integer> map =new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(!map.containsKey(diff)){
                map.put(nums[i],i);
            }
            else{
                res[1] = i;
                res[0] = map.get(diff);
            }
        }
        return res;
        
    }
}