/*Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
You are given a target value to search. If found in the array return its index, otherwise return -1  */

class Solution {
    public int search(int[] nums, int target) {
       if(nums.length==0)return -1;
       
      int n=nums.length;
       
        int pivot = findPivot(nums, 0, n-1);
        
        if (pivot == -1)
           return findElement(nums, 0, n-1, target);

if (nums[pivot] == target)
           return pivot;
        
       if (target>=nums[0])
           return findElement(nums, 0, pivot-1, target);
       return findElement(nums, pivot+1, n-1, target);


        
       
        
    }
    static int findPivot(int arr[], int low, int high)
    {
       // base cases
       if (high < low)  
            return -1;
       if (high == low) 
            return low;
        
       /* low + (high - low)/2; */
       int mid = (low + high)/2;   
       if (mid < high && arr[mid] > arr[mid + 1])
           return mid;
       if (mid > low && arr[mid] < arr[mid - 1])
           return (mid-1);
       if (arr[low] >= arr[mid])
           return findPivot(arr, low, mid-1);
       return findPivot(arr, mid + 1, high);
    }
    public static int findElement(int[] arr, int low, int high,int key)
        {
       if (high < low)
           return -1;
        
           
       int mid = (low + high)/2;  
       if (key == arr[mid])
           return mid;
       if (key > arr[mid])
           return findElement(arr, (mid + 1), high, key);
       return findElement(arr, low, (mid -1), key);
    }
}