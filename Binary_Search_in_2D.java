public class binary_search_in_2D {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("Target found at: " + java.util.Arrays.toString(binary_search_in_2D(matrix, 11)));
    }

    static int[] binary_search_in_2D(int[][] matrix, int target)
    {   
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0)
        {
            if(matrix[row][col] == target)
            {
                return new int[]{row, col};
            }

            if(matrix[row][col] < target)
            {
                row++;
            }

            else
            {
                col--;
            }

        }
        return new int[]{-1, -1};
    }
}
