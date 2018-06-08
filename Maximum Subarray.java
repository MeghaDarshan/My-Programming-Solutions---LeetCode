//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0 || nums==null){return 0;}
        int maxTillHere=nums[0], mac = nums[0];
        for(int i=1;i<nums.length;i++){
            maxTillHere = Math.max(nums[i], maxTillHere+nums[i]);
            mac = Math.max(maxTillHere, mac);
        }
        return mac;
    }
}