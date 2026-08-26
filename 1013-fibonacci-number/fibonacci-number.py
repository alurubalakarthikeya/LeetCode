class Solution:
    def recursivefib(self, n: int):
        if n<=1:
            return n
        else:
            return self.recursivefib(n-1) + self.recursivefib(n-2)
    def fib(self, n: int) -> int:
        return self.recursivefib(n)