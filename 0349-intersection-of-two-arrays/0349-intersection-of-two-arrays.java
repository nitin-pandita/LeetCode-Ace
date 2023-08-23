class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     // optimal solution
     Set<Integer> set1 = new HashSet<>();
     Set<Integer> intersectionSet = new HashSet<>();

     for(int num : nums1) {
         set1.add(num);
     }   
     for(int num : nums2) {
         if(set1.contains(num)) {
             intersectionSet.add(num);
         }
     }

     int [] result = new int[intersectionSet.size()];
     int index= 0;

     for(int num : intersectionSet) {
         result[index++] = num;
     }

     return result;
    }
}