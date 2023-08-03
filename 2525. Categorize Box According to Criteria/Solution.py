class Solution:
    def categorizeBox(self, length: int, width: int, height: int, mass: int) -> str:
        n = 9999
        v = length * width * height
        bulky = False
        heavy = False

        if (length > n or width > n or height > n or v >= 10**9):
            bulky = True
        if (mass > 99):
            heavy = True

        if (bulky and heavy):
            return("Both")
        if (bulky):
            return("Bulky")
        if (heavy):
            return("Heavy")
        
        return("Neither")