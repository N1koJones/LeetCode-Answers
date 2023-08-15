class Solution:
    def removeTrailingZeros(self, num: str) -> str:
        size = len(num) - 1
        while num[size] == '0':
            size -= 1
        return num[0:size+1]