class Solution:
    def encode(self, strs: List[str]) -> str:
        return_string = ""
        for i in strs:
            return_string += i + "|"
        return return_string

    def decode(self, s: str) -> List[str]:
        decodedStrings = []
        if not s:
            return decodedStrings
        
        if s.endswith("|"):
            s = s[:-1]

        decodedStrings = s.split("|")
        return decodedStrings