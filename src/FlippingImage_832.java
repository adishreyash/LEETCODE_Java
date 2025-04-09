//Kunal Kushwaha Done by own

import java.util.Arrays;
public class FlippingImage_832 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
    }
    public static  int[][] flipAndInvertImage(int[][] image){
        for(int[] i:image) {
            int low=0;
            int high=i.length-1;
            while(low<high){
                int temp = i[low];
                i[low]=i[high];
                i[high]=temp;
                low++;
                high--;
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}
