class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        array_length = len(nums)
        for i in range(array_length):
            for j in range(i + 1, array_length):
                if nums[i] == nums[j]:
                    return True
        return False