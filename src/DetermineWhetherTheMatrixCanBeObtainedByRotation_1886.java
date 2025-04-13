import java.util.Arrays;

public class DetermineWhetherTheMatrixCanBeObtainedByRotation_1886 {
    public static void main(String[] args) {
        int[][] mat={{0,1},{1,0}};
        int[][] target ={{1,0},{0,1}};
        System.out.println(findRotation(mat,target));
    }
    public static boolean findRotation(int[][] mat, int[][] target){
        for(int k = 0;k<4;k++){
            int n =mat.length;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j <n ; j++) {
                    int temp = mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
            for(int[] i:mat){
                int low=0;
                int high=n-1;
                while(low<high){
                    int temp =i[low];
                    i[low]=i[high];
                    i[high]=temp;
                    low++;
                    high--;
                }
            }
            if(Arrays.deepEquals(mat,target))
            {
                return Arrays.deepEquals(mat,target);
            }
        }
        return false;
    }

}
