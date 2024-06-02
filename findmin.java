import java.util.Arrays;
import java.util.Scanner;

public class findmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= input.nextInt();

        }
        input.close();
        int ans = findminimum(arr);
        System.out.println(ans);
    }
    static int findminimum(int[] arr){
        int k = arr[0];
        for (int i = 1; i <arr.length ; i++) {

            if (k > arr[i]) {
                k=arr[i];
            }


        }
        return k;
    }
}
