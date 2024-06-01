class Solution:
    def scoreOfString(self, s: str) -> int:
        l = list(''.join(s))
        i = 0
        length = len(l)
        score = 0
        while i < length-1:
            score += abs(ord(l[i+1]) - ord(l[i]))
            i += 1
        return(score)