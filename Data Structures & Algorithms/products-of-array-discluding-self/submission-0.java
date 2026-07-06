class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productExceptSelf = 1;
        int[] productArray = new int[nums.length];
        int arrayLength = nums.length;
        int windowLength = arrayLength - 1;

        productArray[0] = 1;
        for (int i = 1; i < arrayLength; i++) {
            productArray[i] = productArray[i - 1] * nums[i - 1];   
        }
        
        for (int i = windowLength; i >= 0; i--) {
            productArray[i] *= productExceptSelf;
            productExceptSelf *= nums[i];
        }

        return productArray;
    }
}  
