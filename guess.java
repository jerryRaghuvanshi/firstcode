import java.util.Arrays;

public class guess {
    public static void main(String[] args) {
int[] arr ={5,25,75} ;
int target =100;
int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end= arr.length-1;
        int[] ans = {-1, -1};
        while (start<end) {

            if ((arr[end] + arr[start]) == target) {
                ans[0]=start+1;
                ans[1]=end+1;
                return ans;
            }
            if ((arr[end] + arr[start]) > target) {
                end = end - 1;

            }
            if ((arr[end] + arr[start]) < target) {
                start = start+1;
            }



        }

        ans[0] = start+1;
        ans[1] = end+1;
        return ans;
    }
}
