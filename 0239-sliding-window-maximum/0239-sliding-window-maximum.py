from collections import deque
from typing import List

class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        dq = deque()   # stores indices of elements in the current window
        res = []

        for i in range(len(nums)):
            # Remove indices that are out of the window
            if dq and dq[0] <= i - k:
                dq.popleft()

            # Remove elements smaller than nums[i] from the back
            while dq and nums[dq[-1]] <= nums[i]:
                dq.pop()

            dq.append(i)

            # Append result when window size is at least k
            if i >= k - 1:
                res.append(nums[dq[0]])

        return res
