/* Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.*/

class Solution {
    public int majorityElement(int[] nums) {
        
        
        if(nums.length==1)return nums[0];
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                 map.put(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i])>nums.length/2){
                    return nums[i];   
            }
            }
            else{
                map.put(nums[i], 1);
                }
            
        }
        
        return 0;
    }
}