import java.util.*;

public class ContainsDuplicates {

    // Approach 1 - Sorting
    
    public boolean containsDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
    // Time Complexity - O(n log n) due to sorting
    //Space Complexity - O(1) if we ignore the space used by sorting algorithm.


    // Approach 2 - HashSet (Optimal)
    public boolean containsDuplicateSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
    // Time Complexity - O(n) where n is the number of elements in the array.
    // Space Complexity - O(n) in the worst case when all elements are unique.