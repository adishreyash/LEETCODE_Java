import java.util.Arrays;
//For sorted Array ONLY.
public class TwoSumTwoPointer_1 {
    public static void main(String[] args) {
        int[] arr = {2,7,10,11,15,19,23};
        int target = 18;
        System.out.println(Arrays.toString(TwoSum(arr,target)));
    }
    public static int[] TwoSum(int[] arr,int target){
        int[] index = new int[2];
        int left=0;
        int right = arr.length-1;
        while((arr[right]) > target) {
            right--;
        }
        while (left<right){
            if((arr[left]+arr[right])>target){
                right--;
            }
            else if ((arr[left]+arr[right])<target){
                left++;
            }
            else{
                index[0]=left;
                index[1]=right;
                return index;
            }
        }
        return index;
    }
}
