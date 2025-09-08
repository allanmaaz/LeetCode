class Solution:
    def getNoZeroIntegers(self, n: int) -> List[int]:
        def checkzero(x:int)-> bool:
            return '0' in str(x)



        for a in range(1,n):
            b=n-a
            if not checkzero(a) and not checkzero(b):
                return[a,b]   