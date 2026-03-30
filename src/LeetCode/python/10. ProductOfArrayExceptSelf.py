from typing import List
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        pre = 1
        post = 1
        result = [1] * n

        for i in range(n):
            result[i] *=pre
            pre *= nums[i]

        for i in range(n):
            result[i] *=post
            post *=nums[i]
        return result