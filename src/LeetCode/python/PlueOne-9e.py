class Solution:
    def plusOne(self, digits):
        n = len(digits)
        for i in range(n-1, -1, -1):
            if digits[i] < 9:
                digits[i] += 1
                return digits
            else:
                digits[i] = 0
        return [1] + [0] * n
    


##Time complexity: O ( N ) since it's not more than one pass along the input list.
##Space complexity: O ( N )

