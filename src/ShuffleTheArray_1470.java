import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray_1470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt()/2;
        int[] nums = new int[2*n];
        System.out.println("Enter the Array that need to be concatenated");
        for (int i = 0; i < 2*n; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[2*n];
        for (int i = 0, j = 0; i < 2*n; i=i+2,j++) {
            ans[i]=nums[j];
            ans[i+1]=nums[j+n];
        }
        return ans;
    }
}
