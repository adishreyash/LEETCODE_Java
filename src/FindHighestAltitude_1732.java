public class FindHighestAltitude_1732 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain){
        int high = 0;
        int[] higharr = new int[gain.length+1];
        higharr[0]=0;
        for (int i = 0; i < gain.length; i++) {
            higharr[i+1]=higharr[i]+gain[i];
        }
        for (int j : higharr) {
            if (high < j) {
                high = j;
            }
        }
        return high;
    }
}
