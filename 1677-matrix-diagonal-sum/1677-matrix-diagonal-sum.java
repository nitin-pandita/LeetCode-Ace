class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for(int i = 0; i < n; i++) {
            // finding the primary diagonal
            sum += mat[i][i];
            // finding the secondary diagonal
            sum += mat[i][n-1-i];
}            
// checking if the matrix is even or not
            if(n % 2 == 1){
                sum -= mat[n/2][n/2];
            }

            return sum;

    }
}