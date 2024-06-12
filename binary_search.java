public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1, 23, 34, 67, 89, 99};
        int target = 5;
        int ans = bin(arr, target);
        System.out.println(ans);
    }

    static int bin(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;

            }
            if (arr[mid] == target) {
                return mid + 1;
            }
        }
        return start;
    }
}
