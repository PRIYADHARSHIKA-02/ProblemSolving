package LeetCode.java;
class Solution {
    public int RemoveElement(int[] nums, int val) {
        int ind =  0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                nums[ind ++] = nums[i];
            }
        }
        return ind;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)