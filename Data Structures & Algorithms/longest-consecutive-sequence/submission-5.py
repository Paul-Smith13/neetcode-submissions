from typing import List
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if (nums == None or len(nums) == 0): return 0

        nums.sort()
        currentSeq = [nums[0]]
        longestSeq = []

        for i in range (len(nums)):
            last = currentSeq[-1]
            if (nums[i] == last):
                continue
            elif (nums[i] == last + 1):
                currentSeq.append(nums[i])
            else:
                if (len(currentSeq) > len(longestSeq)):
                    longestSeq = currentSeq[:]
                currentSeq.clear()
                currentSeq.append(nums[i])

        if len(currentSeq) > len(longestSeq):
            longestSeq = currentSeq
        return len(longestSeq)