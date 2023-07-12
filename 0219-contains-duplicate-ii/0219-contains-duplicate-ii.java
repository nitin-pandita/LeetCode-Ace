class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> newMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(newMap.containsKey(nums[i]) && i - newMap.get(nums[i]) <= k){
                return true;
            }

            newMap.put(nums[i],i);
        }
        return false;
    }
}