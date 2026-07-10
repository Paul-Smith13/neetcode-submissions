class Solution {
    public int[] replaceElements(int[] arr) {
        //You are given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
        //After doing so, return the array.
        int maxRight = -1;
        for (int i = arr.length -1; i >= 0; i--) {
            int currVal = arr[i];

            arr[i] = maxRight;

            maxRight = Math.max(currVal, maxRight);

        }
        return arr;
    }
}