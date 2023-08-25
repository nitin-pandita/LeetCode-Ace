class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > max ) {
                max = candies[i];
            }
        }

            List<Boolean> list = new ArrayList<>();

            for( int j = 0; j < candies.length; j++) {
                list.add((candies[j] + extraCandies) >= max); 
            } 
            return list;
    }
}