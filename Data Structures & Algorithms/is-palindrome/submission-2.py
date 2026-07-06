class Solution:
    def isPalindrome(self, s: str) -> bool:
        stack = []
        queue = deque()
        char_list = list(s)
        for i in range(len(s)):
            if (char_list[i].isalnum() ):
                stack.append(char_list[i].lower())
                queue.append(char_list[i].lower())

        print(stack)
        print(queue)

        while (stack):
            stack_char = stack.pop()
            queue_char = queue.popleft()
            if (stack_char != queue_char):
                return False
        return True