import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()){
            return(false);
        }

        int carr[] = new int[26];
        for (int i = 0; i < s.length(); i++){
            carr[s.charAt(i) - 'a']++;
            carr[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < carr.length; i++){
            if (carr[i] != 0){
                return(false);
            }
        }
        
        return(true);

    }
}
