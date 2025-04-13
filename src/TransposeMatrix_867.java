import java.util.Arrays;

public class TransposeMatrix_867 {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
    public static int[][] transpose(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposed = new int[n][m];
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                transposed[j][i]=matrix[i][j];
            }
        }
        return transposed;
    }
}
