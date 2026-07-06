class Solution ():
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        product_Except_Self = 1
        nums_length = len(nums)
        products = [1] * nums_length

        window_Length = nums_length - 1

        products[0] = 1
        i = 1
        for i in range(1, nums_length):
            products[i] = products[i-1] * nums[i-1]
        
        i = window_Length
        while i >=0:
            products[i] *= product_Except_Self
            product_Except_Self *= nums[i]
            i -= 1
        return products
       