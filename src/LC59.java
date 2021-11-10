public class LC59 {
    public int[][] generateMatrix(int n) {
        int maxNum = n * n;
        int curNum = 1;

        int row = 0, column = 0;
        int directionIndex = 0;
        int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; //左下右上

        int[][] ans = new int[n][n];

        for (; curNum <= maxNum; curNum++) {
            ans[row][column] = curNum;

            int nextRow = row + direction[directionIndex][0],
                    nextColumn = column + direction[directionIndex][1];
            if (nextRow < 0 || nextRow >= n || nextColumn < 0
                    || nextColumn >= n || ans[nextRow][nextColumn] != 0) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row += direction[directionIndex][0];
            column += direction[directionIndex][1];
        }

        return ans;
    }
}
