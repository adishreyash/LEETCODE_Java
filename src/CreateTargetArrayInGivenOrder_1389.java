import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInGivenOrder_1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(index[i],nums[i]);
        }


        int[] Target = new int[nums.length];
        for (int i = 0; i < Target.length; i++) {
            Target[i]= arrayList.get(i);
        }
        return Target;
    }
}
