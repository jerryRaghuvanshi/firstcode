public class Rotated_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int p = pivot(nums);

        int start = 0;
        int end = nums.length - 1;
        if (p == -1) {
            return binser(nums, target, 0, nums.length - 1);
        }
        if(nums[p]==target){
            return p;
        }
        if (target >=nums[0]) {
            return binser(nums, target, 0, p - 1);
        } else {
            return binser(nums, target, p + 1, nums.length - 1);
        }

    }

    static int binser(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (nums[mid] > target) {
                end = mid - 1;
            }
            if (nums[mid] < target) {
                start = mid + 1;

            }
            if (nums[mid] == target) {
                return mid;
            }

        }


        return start;
    }

    static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (end == 0) {
            return end;
        }
        if (nums.length == 2) {
            if (nums[start] > nums[end]) {
                return start;
            } else {
                return end;
            }
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid + 1 <= end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid + 1 <= end && nums[mid] < nums[mid + 1] && nums[mid] > nums[start]) {
                start = mid + 1;
            }
            if (mid + 1 <= end && nums[mid] < nums[mid + 1] && nums[mid] < nums[start]) {
                end = mid - 1;
            }
            if (start == mid && end == mid) {
                return mid;
            }

        }
        return start;
    }
}
