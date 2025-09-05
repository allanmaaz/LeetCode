class Solution(object):
    def characterReplacement(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        from collections import defaultdict

        c = defaultdict(int)
        maxl=0
        l=0
        res=0
        for r in range(len(s)):
            c[s[r]]+=1
            maxl=max(maxl,c[s[r]])

            while(r-l+1)-maxl>k:
                c[s[l]]-=1
                l+=1

       
            res=max(res,r-l+1)   

        return res
