from typing import List
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        lft, ryt = 0, len(nums) - 1
        while lft <= ryt:
            mid = (lft + ryt)//2
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                lft = mid + 1
            else:
                ryt = mid -1
        return lft
               