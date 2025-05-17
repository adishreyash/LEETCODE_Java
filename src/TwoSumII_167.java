import java.util.Arrays;

public class TwoSumII_167 {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end = numbers.length-1;
        int mid;
        while(start<=end){
            mid = numbers[start]+numbers[end];
            if(mid==target){
                return new int[]{start+1,end+1};
            } else if (mid>target) end--;
            else start++;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,13};
        int target = 13;
        TwoSumII_167 obj = new TwoSumII_167();
        int[] result = obj.twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
