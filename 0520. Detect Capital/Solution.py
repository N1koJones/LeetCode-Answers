class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        if word.isupper() or word.islower():
            return True
        
        word = word.replace(word[0], "", 1)
        if word.islower():
            return True
        return False