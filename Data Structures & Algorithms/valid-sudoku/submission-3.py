class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        columnStrings = [""] * 9
        rowStrings = [""] * 9
        
        for i in range (len(board)):
            for j in range(len(board)):
                rowStrings[i] += board[i][j]
                columnStrings[j] += board[i][j]
        
        print("Column strings")
        for i in columnStrings:
            seenColChars = set()
            for c in i:
                if (c !="." and c in seenColChars):
                    return False
                if c != ".":
                    seenColChars.add(c)
        
        for j in rowStrings:
            seenRowChars = set()
            for c in j:
                if (c != "." and c in seenRowChars):
                    return False
                if c != ".":
                    seenRowChars.add(c)
        
        for box_row in range(0, 9, 3):
            for box_col in range(0, 9, 3):
                seen_box_chars = set()
                for i in range(3):
                    for j in range(3):
                        c = board[box_row + i][box_col + j]
                        if c != '.' and c in seen_box_chars:
                            return False
                        if c != '.':
                            seen_box_chars.add(c)

        return True