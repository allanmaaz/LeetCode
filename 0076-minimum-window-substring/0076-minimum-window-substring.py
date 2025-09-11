from collections import Counter
class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if not s and not t:
            return ""

        need=Counter(t)
        window={}
        have=0
        lenneed=len(need)
        res=[-1,-1]
        resLen=float("inf")
        l=0
        for r in range(len(s)):
            c=s[r]
            window[c]=window.get(c,0)+1

            if c in need and window[c]==need[c]:
                have+=1

            while have==lenneed:
                if(r-l+1)<resLen:
                    res=[l,r]
                    resLen=r-l+1

                window[s[l]]-=1
                if s[l] in need and window[s[l]]<need[s[l]]:
                    have-=1
                l+=1
        l,r=res
        return s[l:r+1] if resLen!=float("inf") else ""