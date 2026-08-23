class Solution:
    def reverse(self, x: int) -> int:
        temp = x
        num = 0
        sign = 1
        if x < 0:
            sign = -1
        temp = temp * sign
        while temp != 0:
            digit = temp % 10
            num = num * 10 + digit
            temp //= 10
        if num < -2**31 or num > 2**31 - 1:
            return 0
        return num * sign
