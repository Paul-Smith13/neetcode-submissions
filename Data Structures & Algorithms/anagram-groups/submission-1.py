class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagramMap = defaultdict(list)
        for i in strs:
            if (i is not None):
                chars = list(i)
                print(chars)
                sortedChars = sorted(chars)
                key = ''.join(sortedChars)
                anagramMap[key].append(i)
        return list(anagramMap.values())