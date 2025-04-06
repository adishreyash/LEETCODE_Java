import java.util.Arrays;
import java.util.Scanner;

//Question No.2 ofKunal Kushawaha
public class ConcatenationOfArray_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the Array that need to be concatenated");
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }
    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] arr = new int[2*n];
        for (int i = 0; i < n; i++) {
            arr[i]=nums[i];
            arr[i+n] = nums[i];
        }
    return arr;
    }
}
