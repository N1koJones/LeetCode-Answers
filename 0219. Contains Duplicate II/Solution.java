class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int size = nums.length;

        for (int i = 0; i < size; i++){
            if (map.containsKey(nums[i])){
                if (Math.abs(i - map.get(nums[i])) <= k){
                    map = null;
                    return(true);
                }
            }
            map.put(nums[i], i);
        }

        return(false);
    }
}