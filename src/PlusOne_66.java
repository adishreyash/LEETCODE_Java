import java.util.Arrays;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] di ={9,9,9};
        System.out.println(Arrays.toString(plusOne(di)));
    }
    public static int[] plusOne(int[] digits){
        for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int[] ouptut_arr = new int[digits.length+1];
        ouptut_arr[0]=1;
        return ouptut_arr;

    }
}
