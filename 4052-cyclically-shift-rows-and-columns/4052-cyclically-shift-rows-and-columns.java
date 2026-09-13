class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {

        int[][] rows = new int[2 * n][n];
        int[][] cols = new int[n][2 * n];
        int[][] ans = new int[n][n];

        //for cols
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cols[i][j] = grid[i][j];
                cols[i][n + j] = grid[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                grid[i][j] = cols[i][j +rowShift[i]];
            }
        }

        //for rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rows[i][j] = grid[i][j];
                rows[n + i][j] = grid[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                grid[i][j] = rows[i+colShift[j]][j];
            }
        }

        return grid;

    }
}