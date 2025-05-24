//public class KthMissingPositiveNumber_1539 {
//    public static int findKthPositive(int[] arr, int k){
//        int num = 1;
//        int i = 0;
//        while(i< arr.length&&k>0){
//            if(arr[i]==num){
//                i++;
//            }
//            else{
//                k--;
//            }
//            num++;
//        }
//        return --num;
//    }

public class KthMissingPositiveNumber_1539 {
    public static int findKthPositive(int[] arr, int k){
        int left=0, right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]-mid-1>=k){
                right = mid-1;
            }
            else{
                left = mid +1;
            }
        }
        return left+k;
    }




    public static void main(String[] args) {
    int[] arr = {2,3,4,7,11};
    int k = 5;
        System.out.println(findKthPositive(arr,k));
    }
}
