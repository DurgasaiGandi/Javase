import java.util.Scanner; // Import the Scanner class to read user input

public class MatrixReader {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3]; // Declare a 2D array to represent the matrix
        Scanner scan = new Scanner(System.in); // Create a new Scanner object to read user input

        System.out.println("Enter 3x3 Matrix elements: ");
        for(int i=0; i<3; i++) { // Loop through each row of the matrix
            for(int j=0; j<3; j++) { // Loop through each column of the current row
                matrix[i][j] = scan.nextInt(); // Read the next integer value from user input and store it in the current matrix element
            }
        }

        System.out.println("Entered Matrix: ");
        for(int i=0; i<3; i++) { // Loop through each row of the matrix
            for(int j=0; j<3; j++) { // Loop through each column of the current row
                System.out.print(matrix[i][j] + " "); // Print the current matrix element followed by a space
            }
            System.out.println(); 
        }

        scan.close(); // Close the Scanner object to free up system resources
    }
}