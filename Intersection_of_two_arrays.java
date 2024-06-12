import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_two_arrays {
    public static void main(String[] args) {
int[]arr={1,2,2,1};
int[]brr={2,2};
int[]ans=intersection(arr,brr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] intersection(int[] arr,int[] brr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int k : arr) {
            for (int j = 0; j < brr.length; j++) {
                if (k == brr[j]) {
                    list.add(brr[j]);
                    brr[j] = -1;
                    break;
                }
            }

        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
