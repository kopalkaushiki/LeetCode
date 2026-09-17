class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        nums.sort()
        left = 0
        right = len(nums) - 1
        count = 0
        while(left<right):
            total = nums[left] + nums[right]
            if(total == k):
                count = count +1
                left = left + 1
                right = right - 1
            elif(total < k):
                left = left + 1
            else:
                right = right - 1
        return count 
            

        