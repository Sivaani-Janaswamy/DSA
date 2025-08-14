import java.util.*;
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;

        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        int total = m * n, count = 0;

        while (count < total) {

            for (int j = left; j <= right && count < total; j++) {
                result.add(matrix[top][j]);
                count++;
            }
            top++;


            for (int i = top; i <= bottom && count < total; i++) {
                result.add(matrix[i][right]);
                count++;
            }
            right--;

            for (int j = right; j >= left && count < total; j--) {
                result.add(matrix[bottom][j]);
                count++;
            }
            bottom--;

            for (int i = bottom; i >= top && count < total; i--) {
                result.add(matrix[i][left]);
                count++;
            }
            left++;
        }

        return result;
    }
    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(sm.spiralOrder(matrix));
    }
}