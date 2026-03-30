def countNumWithUniqueDigit(self, n: int) -> int:
    if n ==0:
        return 1
    ans = 10
    start= 9
    current =9
    n-=1

    while n>0:
        current *= start
        ans += current
        start -= 1
        n -= 1
    return ans