class Solution:
    def myPow(self, x: float, n: int) -> float:
        def helper(x,n):
            if x==0: return 0
            if n==0: return 1

            res = helper(x,n//2)
            res = res * res
            return x*res if n % 2 else res
        res = helper(x, abs(n))
        return res if n >= 0 else 1/res
    
    
##Time Complexity: O(log n) (Because each time you divide n by 2)

##Space Complexity: O(log n) (recursive stack)