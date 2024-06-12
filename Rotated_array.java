public class Rotated_array {
    public static void main(String[] args) {
        int[] arr = {3,1};
        int target = 1;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int pivot = peak(nums);
        if(nums.length==1&&nums[pivot]!=target){
            return -1;
        }
        if (pivot == -1) {
            return pinser(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if(nums.length==2&&nums[0]!=target&&nums[1]!=target){
            return -1;
        }
        if (target >= nums[0]) {
            return pinser(nums, target, 0, pivot - 1);
        }

        return pinser(nums, target, pivot + 1, nums.length - 1);

    }

    static int pinser(int[] nums, int target, int start, int end) {

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
            if (start==end && nums[start]!=target){
                return -1;
            }
        }
        return nums[start];
    }

    static int peak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid - 1] > nums[mid]) {
                return mid - 1;

            } else if (nums[start] > nums[mid]) {
                end = mid - 1;}
                if (start==end && mid==start){
                    return start;
                }
             else  {
                start = mid + 1;
            }
        }
        return -1;
    }
}
