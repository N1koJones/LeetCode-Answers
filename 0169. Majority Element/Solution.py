class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        ans = nums[0]
        count = 1
        for i in range(1, len(nums)):
            if count == 0:
                count += 1
                ans = nums[i]
            elif ans == nums[i]:
                count += 1
            else:
                count -= 1
        return(ans)