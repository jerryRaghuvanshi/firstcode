public class ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 23, 34, 67, 89, 99};
        int target = 25;

        System.out.println(selling(arr, target));
    }

    static int selling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
                if (arr[end-1] < target ) {
                    return arr[end+1];
                }

            }

            if (arr[mid] < target) {
                start = mid + 1;

                if (arr[start+1] > target ) {
                    return arr[start+1];
                }
            }
            if (arr[mid] == target) {
                return arr[mid];

            }
        }
return -1;
    }

}
