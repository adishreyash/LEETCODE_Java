public class FindNumberWithEvenNumbersOfDigit_1295 {
    public static void main(String[] args) {
        int[] arr= {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums){
        int even_count= 0;
        for (int i:nums) {
            int count = 0;
            int data = i;
            while(data!=0){
                data/=10;
                count++;
            }
            if(count%2==0){
                even_count++;
            }
        }
        return even_count;
    }
}
//Better version of this code can be done using Math library and Math.log10
// function but make sure to type cast the math.log10 to int and add 1 before taking out the even
// or odd
