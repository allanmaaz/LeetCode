class Solution(object):
    def makeTheIntegerZero(self, num1, num2):
        """
        :type num1: int
        :type num2: int
        :rtype: int
        """
        for k in range(1,61):
            x=num1- k * num2

            if x<0:
                return -1

            
            ones=bin(x).count("1")

            if ones<=k<=x:
                return k

        
        return -1
        
        