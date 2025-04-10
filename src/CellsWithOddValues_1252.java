public class CellsWithOddValues_1252 {
    public static void main(String[] args) {
        int m=2,n=3;
        int[][] arr ={{0,1},{1,1}};
        System.out.println(oddCells(m,n,arr));
    }
    public static int oddCells(int m, int n, int[][] indices){
        int[][]arr = new int[m][n];
        int[] row = new int[indices.length];
        int[] col = new int[indices.length];
        int odd = 0;

        for(int i = 0; i < indices.length ; i++) {
            row[i]=indices[i][0];
            col[i]=indices[i][1];
        }
        for (int i : row) {
            for (int j = 0; j < n; j++) {
                arr[i][j]++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j:col){
                arr[i][j]++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]%2!=0){
                    odd++;
                }
            }
        }
        return odd;
    }
}
