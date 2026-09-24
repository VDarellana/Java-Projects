import java.util.Arrays;

public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB){
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        if(colsA != colsB){
            return null;
        }

        int[][] result = new int[rowsA][colsB];

        for(int i = 0; i < rowsA; i++){
            for(int j = 0; j < colsB; j++){
                int sum = 0;
                for(int k = 0; k < colsA; k++){
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] += sum;
            }
        }

        return result;
    }    


    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiplyMatrices(new int[][]{{2,4},{4,5}}, new int[][]{{7,4},{5,6}})));
    }
}
