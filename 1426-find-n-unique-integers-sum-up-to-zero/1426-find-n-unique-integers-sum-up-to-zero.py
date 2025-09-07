class Solution:
    def sumZero(self, n: int) -> List[int]:
        list=[]

        for i in range(1,n//2+1):
            list.append(i)
            list.append(-i)



        if n%2==1:
            list.append(0)

        return list
