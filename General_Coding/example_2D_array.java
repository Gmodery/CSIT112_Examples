package General_Coding;
public class example_2D_array {
    public static void main(String[] args) {
        // final sets these values as constant, meaning they can't be changed
        final int ROWS = 11;
        final int COLS = 11;

        // The following line initializes a new 2D matrix
        // It is initialized with size ROWS by COLS
        int[][] matrix = new int[ROWS][COLS];

        // The outer for loop iterates over the rows
        for (int i = 0 ; i < ROWS ; i++) {
            // The inner for loop iterates over the columns
            for (int j = 0 ; j < COLS ; j++) {
                // At each iteration, matrix at [i][j] is set to their product
                matrix[i][j] = i*j;
            }
        }
    
        // These lines print the matrix
        for (int i = 0; i < ROWS; i++) {
            System.out.print('[');

            for (int j = 0; j < COLS; j++) {
                System.out.print(matrix[i][j]);

                if (j != COLS - 1)
                    System.out.print(",\t");
            }
            System.out.println(']');
        }
    }
}
