package binarysearch;

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        // number of rows
        int row = matrix.length;
        // number of cols
        int col = matrix[0].length;
        int start = 0;
        int end = row * col - 1;

        // binary search
        while (start <= end) {
            int mid = (start + end) / 2;
            int midElement = matrix[mid / col][mid % col];
            if (midElement == target) return true;

            if (midElement < target) start = mid + 1;
            else end = mid - 1;
        }

        return false;
    }
}
