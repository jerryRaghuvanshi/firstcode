public class evendigitarray {
    public static void main(String[] args) {
        int[] arr = {1, 12, 345, 60456};
        int ans = finder(arr);
        System.out.println(ans);
    }

    static int finder(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; nums[i] != 0; j++) {

                nums[i] = nums[i] / 10;
                if ( nums[i]==0 && j % 2 == 0) {
                    count++;
                }
            }


        }
        return count;
    }

}
