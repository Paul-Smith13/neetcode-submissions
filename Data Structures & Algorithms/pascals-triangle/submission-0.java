class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<Integer> startList = new ArrayList<>();
        startList.add(1);
        List<List<Integer>> outerList = new ArrayList<>();
        
        outerList.add(startList);
        
        List<Integer> previousRow = startList;

        int i = 1;
        while (i < numRows) {
            List<Integer> newRow = new ArrayList<>(i);

            //Need boundary 1s
            newRow.add(1);
            for (int j = 0; j < previousRow.size() -1 ; j++) {
                newRow.add(previousRow.get(j) + previousRow.get(j + 1));
            }
            newRow.add(1);

            previousRow = newRow;
            outerList.add(previousRow);
            i++;
        }

        return outerList;
    }
}