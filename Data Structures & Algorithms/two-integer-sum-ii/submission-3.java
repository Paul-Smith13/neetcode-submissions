class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length-1;
        int[] sumNums = new int[2]; 
        /*
        for (int i = 0; i < numbers.length; i++){
            index1 = numbers[i];
            for (int j = 0; j < numbers.length; j++){
                index2 = numbers[j];
                if (index1 + index2 == target){
                    sumNums[0] = index1;
                    sumNums[1] = index2;
                    return sumNums;
                }

            }
        }
        */
        while (index1 <index2) {
            int sum = numbers[index1] + numbers[index2];
            if (sum == target) {
                return new int[] {index1 + 1, index2 + 1 };

            } else if (sum < target){
                index1++;

            } else {
                index2--;
            }
            
        }
        return new int[0];
    }
}
