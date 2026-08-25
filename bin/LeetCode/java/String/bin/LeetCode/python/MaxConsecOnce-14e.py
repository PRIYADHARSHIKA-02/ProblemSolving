from typing import List
class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        ans = 0
        count = 0
        for n in nums:
            if n == 1:
                count += 1
            else:
                ans = max(ans,count)
                count = 0
        ans = max(ans,count)
        return ans
    


##TC - O(n), where n is the length of the list nums.
##Reason: We are iterating through the list only once.

##SC - O(1) (constant space).
##Reason: We're using a fixed number of variables (ans, count) regardless of the input size.

## Single Pass (Linear Scan) approach.