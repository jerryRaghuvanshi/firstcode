public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1, 23, 34, 67, 89, 99};
        int target = 1;
        int ans = bin(arr,target);
        System.out.println(ans);
    }

    static int bin(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }  if (arr[mid] < target) {
                start = mid + 1;

            }  if (arr[mid] == target) {
                return mid+1;
            }
        }
        return -1;
    }
}
