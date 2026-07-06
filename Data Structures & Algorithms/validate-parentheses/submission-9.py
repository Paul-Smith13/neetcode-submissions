class Solution:
    def isValid(self, s: str) -> bool:
        #characters = [char for char in s]
        characters = []
        for char in s:
            if (self.isOpenParenthesis(char)):
                characters.append(char)
            else:
                if not characters: 
                    return False
                stack_top = characters.pop()
                if (self.parenthesisMatch(char, stack_top) != True):
                    return False
        return not characters 

    def isOpenParenthesis(self, character: str):
        return character in ['(', '[', '{']

    def parenthesisMatch(self, c1: str, c2: str):
        if ((c1 == ')' and c2 !='(') or (c1 == '}' and c2 !='{') or (c1 == ']' and c2 !='[')):
            return False
        return True