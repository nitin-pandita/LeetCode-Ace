class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // if checking the two arrrays
        Set<Integer> IntersectionSet = new HashSet<>();
        for(int num1 : nums1){
            for(int num2 : nums2){
                if(num1 == num2) {
                    IntersectionSet.add(num1);
                    break;
                }
            } 
        }
        int[] result = new int[IntersectionSet.size()];
        int index = 0;

        for(int num : IntersectionSet) {
            result[index++] = num;
        }
        return result;
    }
}