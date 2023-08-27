class Solution {
    public int largestAltitude(int[] gain) {
        int currentAlt = 0;
        int maxAltitude = 0;

        for(int point : gain) {
            currentAlt += point;
            maxAltitude = Math.max(currentAlt, maxAltitude);
        }
        return maxAltitude;
    }
}