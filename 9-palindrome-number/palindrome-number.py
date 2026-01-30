class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        reverse = 0
        copy = x
        if x < 0:
            return False
        while copy != 0:
            digit = copy % 10
            reverse = reverse * 10
            reverse += digit
            copy /= 10
        if reverse == x:
            return True
        return False
        