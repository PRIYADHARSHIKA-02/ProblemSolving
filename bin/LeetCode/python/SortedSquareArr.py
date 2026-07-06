from typing import List
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        res = []
        l , r = 0, len(nums) - 1
        while l <= r:
            if nums[l] * nums[l] > nums[r] * nums[r]:
                res.append(nums[l] * nums[l])
                l += 1
            else:
                res.append(nums[r] * nums[r])
                r -= 1
        return res[::-1]

# Two-Pointer  approach
# Time Complexity: O(N), where N is the length of A.
# Space Complexity: O(N) if you take output into account and O(1) otherwise.
# w7e
