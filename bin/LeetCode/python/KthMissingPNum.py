from typing import List
class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        l , r = 0, len(arr) - 1  #initialize the bn boundaries
        while l <= r:
            m = (l + r)//2
            missing = arr[m] - m -1

            if missing < k:
                l = m + 1
            else:
                r = m - 1
        return r + k + 1
    
#w6e
## Time Complexity: O(log n), due to the binary search.
## Space Complexity: O(1), as we are using a constant amount of extra space.