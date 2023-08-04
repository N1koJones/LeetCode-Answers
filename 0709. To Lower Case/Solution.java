class Solution {
    public String toLowerCase(String s) {
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            if (64 < c[i] && c[i] < 91){
                c[i] += 32;
            }
        }
        String ans = new String(c);
        return(ans);
    }
}