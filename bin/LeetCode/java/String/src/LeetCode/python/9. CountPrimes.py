class Solution:
    def countPrimes(self, n: int) -> int:
        if n <= 2:
            return 0
        ip = [True] * n
        ip[0] = ip[1] = False
        for i in range(2,n):
            if ip[i]:
                for indx in range(i * 2, n,i):
                    ip[indx] = False
        return sum(ip)