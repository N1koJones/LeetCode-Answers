class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        ans = 0
        size = len(nums)
        while ans < size:
            if nums[ans] == val:
                nums.pop(ans)
                size -= 1
            else:
                ans += 1
        return ans