class Solution {
    public boolean areOccurrencesEqual(String s) {
        int carr[] = new int[26];
        int size = s.length();
        for (int i = 0; i < size; i++){
            carr[s.charAt(i) - 'a']++;
        }
        int lnz = carr[s.charAt(0) - 'a'];
        for (int i = 0; i < 26; i++){
            if (carr[i] != 0 && carr[i] != lnz){
                return(false);
            }
        }
        return(true);
    }
}