class Solution:
    def getNoZeroIntegers(self, n: int) -> List[int]:
        def checkzero(x:str)-> bool:
            return '0' in x

        for a in range(1,n):
            b=n-a
            if not checkzero(str(a)+str(b)):
                return[a,b]   