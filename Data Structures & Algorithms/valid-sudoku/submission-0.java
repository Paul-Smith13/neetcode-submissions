class Solution {
    public boolean isValidSudoku(char[][] board) {
        String[] columnStrings = new String[9];
        String[] rowStrings = new String[9];
        for (int i = 0; i < board.length; i++){
            columnStrings[i] = "";
            rowStrings[i] = "";
        }

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                rowStrings[i] += board[i][j];
                columnStrings[j] += board[i][j];
            }
        }
        
        System.out.println("Column strings:");
        for (String colString : columnStrings){
            Set<Character> seenColCharacters = new HashSet<>();

            for (char c : colString.toCharArray()){
                if (c != '.' && !seenColCharacters.add(c)){
                    return false;
                }
            }
        }

        for (String rowString : rowStrings){
            Set<Character> seenRowCharacters = new HashSet<>();

            for (char c : rowString.toCharArray()){
                if (c != '.' && !seenRowCharacters.add(c)){
                    return false;
                }
            }
        }

        //Subgrid check
        for (int boxRow = 0; boxRow < 9; boxRow += 3){
            for (int boxCol = 0; boxCol< 9; boxCol +=3){
                Set<Character> seenBoxChars = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[boxRow + i][boxCol + j];
                        if (c != '.' && !seenBoxChars.add(c)) {
                            return false;
                        }
                    }
                }


            }
        }
        return true;
    }

}
