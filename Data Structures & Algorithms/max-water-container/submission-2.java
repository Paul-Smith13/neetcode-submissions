class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int left = 0;
        int right = heights.length - 1;
        int min = 0;
        int max = heights[heights.length - 1];
        while (left < right){
            int currentHeight = Math.min(heights[left], heights[right]);
            int currentWidth = right - left;
            int currentArea = currentHeight * currentWidth;
            result = Math.max(result, currentArea);
            if (heights[left] < heights[right]) {
                left++;
            } else{
                right--;
            }

        }
        return result;
    }


}
