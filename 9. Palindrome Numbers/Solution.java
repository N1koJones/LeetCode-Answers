class Solution {
    public boolean isPalindrome(int x) {
        /*
        Try an ArrayList approach and move number to AL and then use 
        addFirst()  removeFirst()
        addLast()   removeLast()
        */
        // Edge Cases
        if (x < 0 || x % 10 == 0 && x != 0){
            return(false);
        }
        else if (x < 10){
            return(true);
        }

        // Creating variables
        ArrayList<Integer> alist = new ArrayList<Integer>();
        double size = Math.ceil(Math.log10(x));

        // Adding to ArrayList
        for (int i = 0; i < size; i++){
            alist.add(x % 10);
            x /= 10;
        }

        // Taking half of ArrayList
        double itt = Math.floor(size/2);
        for (int i = 0; i < itt; i++){
            if (alist.get(i) != alist.get((int)size-i-1)){
                return(false);
            }
        }
        return(true);
    }
}