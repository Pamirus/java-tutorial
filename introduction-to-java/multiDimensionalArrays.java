public class multiDimensionalArrays {
    public static void main(String[] args) {
        int[][] myIntegerMatrix = new int[3][3];

        myIntegerMatrix[0][0] = 0;
        myIntegerMatrix[0][1] = 1;
        myIntegerMatrix[0][2] = 2;
        
        myIntegerMatrix[1][0] = 3;
        myIntegerMatrix[1][1] = 4;
        myIntegerMatrix[1][2] = 5;

        myIntegerMatrix[2][0] = 6;
        myIntegerMatrix[2][1] = 7;
        myIntegerMatrix[2][2] = 8;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myIntegerMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
