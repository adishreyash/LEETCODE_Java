import java.util.Arrays;

public class HowManyNumbersaresmallerthanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(NumbersaresmallerthanCurrentNumber(nums)));
    }
    public static int[] NumbersaresmallerthanCurrentNumber(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int c = 0;
            for (int num : nums) {
                if (nums[i] == num) {
                    continue;
                }
                if (nums[i] > num) {
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
}
