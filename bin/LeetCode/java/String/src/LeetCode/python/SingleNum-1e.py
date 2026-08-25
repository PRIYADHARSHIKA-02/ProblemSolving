class Solution(object):
    def singleNumber(self, nums):
        
      res=0
      for n in nums:
          res=res^n
      return res
       

nums_input = input()
nums = list(map(int, nums_input.split()))
sol = Solution()
result = sol.singleNumber(nums)
print(result)
