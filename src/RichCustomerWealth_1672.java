import java.util.Scanner;

public class RichCustomerWealth_1672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m");
        int m = sc.nextInt();
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println("Enter the Arrays Accounts");
        int[][] accounts = new int[m][n];
        for (int[] i:accounts){
            for (int j = 0; j <i.length; j++) {
                i[j]=sc.nextInt();
            }
        }
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts){
        int maxWealth = 0;
        for(int[] i :accounts) {
            int sum = 0;
            for(int j = 0; j < i.length; j++) {
                sum = sum + i[j];
            }
            if(sum>maxWealth){
                maxWealth=sum;
            }
        }
        return maxWealth;
    }
}
