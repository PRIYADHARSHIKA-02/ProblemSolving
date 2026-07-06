from collections import Counter
from typing import List

def majorityElement(nums: List[int]) -> int:
  
  res= None
  count = 0
  for i in nums:
      if count == 0:
          return i
      if i == res:
         count += 1
      else:
         count -=1
   return res
    
    

nums_input = input()
nums = list(map(int, nums_input.split()))
print(majorityElement(nums))
