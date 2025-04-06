import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNumberOfCandies_1431 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        int n = 3;
        System.out.println(kidsWithCandies(arr,n));
    }
    public static List<Boolean> kidsWithCandies(int[] nums, int extra){
        ArrayList<Boolean> bool = new ArrayList<>(5);
        int max=0;
        for (int i :nums) {
            if (max<=nums[i]){
                max=nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]+extra>=max){
                bool.add(i,true);
            }
            else{
                bool.add(i,false);
            }
        }
        return bool;
    }
}
