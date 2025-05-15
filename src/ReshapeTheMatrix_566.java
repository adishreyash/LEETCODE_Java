import java.util.Arrays;

public class ReshapeTheMatrix_566 {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int r = 1;
        int c =4;

        System.out.println(Arrays.deepToString(matrixReshape(arr,r,c)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows =mat.length;
        int col = mat[0].length;
        int col_num=0;
        int row_num=0;
        if(rows*col!=r*c){
            return mat;
        }
        int[][] output_arr = new int[r][c];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                output_arr[row_num][col_num]= mat[i][j];
                col_num++;
                if(col_num==c){
                    col_num=0;
                    row_num++;
                }
            }
        }
        return output_arr;
    }
}
