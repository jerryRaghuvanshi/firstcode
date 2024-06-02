import java.util.Scanner;

public class ff {
    public static void main(String[] args) {
        int[] nums = {11, 12, 34, 56, -2, -4, 35};
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        int ans = newf(nums, in);
        System.out.println(ans);


    }

   static int newf (int arr[],int target) {
        if (arr.length==0){
            return -1;
        }
       for (int i = 0; i <arr.length ; i++) {
           int k = arr[i];
           if (arr[i]==target){
               return i+1;
           }


       }
       return -1;
    }
}
