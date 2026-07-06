class Solution:
    def maxArea(self, heights: List[int]) -> int:
        result = 0
        left = 0
        right = len(heights) - 1
        while (left < right):
            current_height = min(heights[left], heights[right])
            current_width = right - left
            current_area = current_height * current_width
            result = max(result, current_area)
            if (heights[left] < heights[right]):
                left += 1
            else:
                right -= 1

        return result