class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        numberMap = {}
        for i in nums:
            numberMap[i]  = numberMap.get(i, 0) + 1
            print(f"Updating {i}")
            
        kNums = []
        for i in range(k):
            current_max_frequency = -1
            current_most_frequent_number = None

            for number, frequency, in numberMap.items():
                if frequency > current_max_frequency:
                    current_max_frequency = frequency
                    current_most_frequent_number = number
            
            if current_most_frequent_number is not None:
                kNums.append(current_most_frequent_number)
                numberMap[current_most_frequent_number] = -1

        return kNums