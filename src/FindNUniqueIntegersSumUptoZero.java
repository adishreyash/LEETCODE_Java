import java.util.Arrays;
public class FindNUniqueIntegersSumUptoZero {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n){
        int[] arr = new int[n];
        int num=1;
        for (int i = 1; i <n ; i+=2) {
            arr[i-1]=-num;
            arr[i]=num;
            num++;
        }

        return arr;
    }
}
