package ExamStyleQuestionsWithCode;

public class ArrayThreeDimensional {
    public static void main(String[] args) {
        int size = 3;

        char[][][] cube = new char[size][size][size];

        initializeCube(cube, size);

        // Print the cube elements
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    System.out.print(cube[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void initializeCube(char[][][] cube, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    cube[i][j][k] = (char)('a' + (i * size + j * size + k));
                }//end of k for loop
            }//end of j for loop
        }//end of i for loop
    }//end of initializeCube method
}
