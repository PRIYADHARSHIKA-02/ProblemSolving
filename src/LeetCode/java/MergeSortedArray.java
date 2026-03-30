class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1;
        int j = n-1;
        int p = m + n -1;
        while (i >= 0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[p] = nums1[i];
                i--;
            }else{
                nums1[p] = nums2[j];
                j--;
            }
            p--;
        }
        while(j >= 0){
            nums1[p]=nums2[j];
            j--;
            p--;
        }
    }
}

// Time Complexity:
// Each element from both arrays is processed at most once because i and j only move backward → O(m + n).

// Space Complexity:
// Only three integer variables (i, j, p) are used → no extra array → O(1).
  