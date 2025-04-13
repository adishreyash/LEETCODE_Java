import java.util.*;

public class AddToArray_FormOfInteger_989 {
    public static void main(String[] args) {
        int[] num = {2,7,4};
        int k = 181;
        System.out.println(addToArrayForm(num,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> l =new ArrayList<>(10);
        int sum ,d,carry=0,n;
        for (int i1 = num.length-1; i1 >=0 || k>0 ; i1--) {
            if(i1>=0){
                d=num[i1];
            }else d=0;
            sum = d+(k%10)+carry;
            n=sum%10;

            l.add(n);
            k/=10;
            carry=sum/10;
        }
        if(carry>0){
            l.add(carry);
        }
        Collections.reverse(l);
        return l;
    }
}
