/* Given an array nums of n integers where n > 1,  
return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] out=new int[len];
        
        out[0]=1;
        for(int i=1;i<len;i++){
            out[i] = out[i-1]*nums[i-1];
           
        }
        
        int right=1;
        for(int j=len-1;j>=0;j--){
            out[j] =out[j]*right;
            right = right*nums[j];
            
        }
        return out;
    }
}