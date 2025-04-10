public class MatrixDiagonalSum_1572 {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int[][] mat){
        int n =mat.length;
        int sum = 0;
        if(n%2==0) {
            for (int i = 0; i <n ; i++) {
                    sum+=mat[i][i];
                    sum+=mat[i][n-1-i];
            }
        }
        else{
            for (int i = 0; i < n; i++) {
                    sum+=mat[i][i];
                    sum+=mat[i][n-i-1];
            }
            sum= sum-mat[n /2][n/2];

        }
        return sum;
    }
}
