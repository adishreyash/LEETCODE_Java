import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInAMatrix_1380{
    public static void main(String[] args) {
        int[][]  matrix={{7,8},{1,2}};
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers(int[][] matrix){
        List<Integer> luckyNumber = new ArrayList<>(10);
        int n = matrix[0].length;
        int col=0;
        
        //minimum elements of every row input to rowMin list
        int min ;
        for (int[] ints : matrix) {
            min = ints[0];
            for (int j = 0; j < n; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                    col = j;
                }
            }
            boolean isMax = true;
            for (int j = 0; j < n; j++) {
                if (matrix[j][col] > min) {
                    isMax = false;
                    col=0;
                    break;
                }
            }
            if (isMax) {
                luckyNumber.add(min);
            }
        }
        return luckyNumber;
    }

}
