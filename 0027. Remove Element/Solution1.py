class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        ans = 0
        while ans < len(nums):
            if nums[ans] == val:
                nums.pop(ans)
            else:
                ans += 1
        return ans