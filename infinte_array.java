public class infinte_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int target = 15;
        int ans = arr(arr, target);

            System.out.println(ans);

    }


    static int arr(int[] arr, int target) {
        int start = 0;

        int end = 1;

        while (start <= end) {
            if (target > arr[end]) {


                int newStart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newStart;
            }

            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;

            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            }

        }
        return start - 1;
    }
}