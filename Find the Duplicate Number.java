/* Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. 
Assume that there is only one duplicate number, find the duplicate one. */

class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> set=new HashSet<Integer>();
        int len=nums.length;
        
        for(int i=0;i<len;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            else{
                set.add(nums[i]);
            }
        }
      return 0;  
    }
}