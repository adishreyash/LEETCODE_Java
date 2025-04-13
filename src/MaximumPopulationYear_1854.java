public class MaximumPopulationYear_1854 {
    public static void main(String[] args) {
        int[][] logs = {{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}};
        System.out.println(maximumPopulation(logs));
    }
    public static int maximumPopulation(int[][] logs){
        int ans=1950;
        int max=0;
        int[] arr = new int[101];
        for (int[] log : logs) {
            arr[log[0] - 1950]++;
            arr[log[1] - 1950]--;
        }
        for(int i = 1; i < 101; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
        for (int i = 0;i<101;i++) {
            if (arr[i] > max) {
                max =arr[i];
                ans = i+1950;
            }
        }
        return ans;
    }
}
