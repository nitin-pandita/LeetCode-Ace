class Solution {
    public boolean containsDuplicate(int[] nums) {
        // base condition 
        if(nums.length == 0) {
            return true;
        }
// creating HashSet
        Set<Integer> newSet = new HashSet<Integer>();

        for(int num: nums){
            if(newSet.contains(num)){
                return true;
            }
            newSet.add(num);
        }
        return false;
    }
}