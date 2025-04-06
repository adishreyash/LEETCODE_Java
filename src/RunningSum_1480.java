import java.util.Arrays;
import java.util.Scanner;

//Question_no 2 of Kunal Kushwaha
public class RunningSum_1480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int n = sc.nextInt();
        System.out.println("Enter the Array");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums){
        int n = nums.length;
        int[] arr = new int [n];
        arr[0]= nums[0];
        for (int i = 1; i < n; i++) {
            arr[i]=nums[i]+arr[i-1];
        }
    return arr;
    }
}
