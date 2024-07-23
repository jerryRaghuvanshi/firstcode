public class Find_a_duplicate_no {
    public static void main(String[] args) {
        int[] nums = {2, 5, 9, 6, 9, 3, 8, 9, 7, 1};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    static int findDuplicate(int[] nums) {
        boolean[] contains = new boolean[nums.length];

        int end = nums.length - 1;
        for (int i = 0; i <= end; i++) {


            if (contains[nums[i]]) {
                return nums[i];
            }
            contains[nums[i]] = true;
            if (contains[nums[end]]) {
                return nums[end];
            }
            contains[nums[end]] = true;


            end--;

        }
        return 0;
    }
}
