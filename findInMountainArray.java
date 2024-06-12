public class findInMountainArray {
    public static void main(String[] args) {

    }static int mountain_peak(int[] arr,int target){
        int start = 0;

        int end = arr.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]&&arr[mid] > arr[mid-1]) {
                int p = arr[mid];
                if (p==target) {
                    return p;
                }
                 start = 0;
                end=p;
                while (start <= end) {
                     mid = start + (end - start) / 2;
                    if (arr[mid] > target) {
                        end = mid - 1;

                    }
                    else {
                        start = mid + 1;
                    }
                }
                int a =start;
                start = p;
                end= arr.length-1;
                while (start <= end) {
                    mid = start + (end - start) / 2;
                    if (arr[mid] > target) {
                        end = mid - 1;

                    }
                    else {
                        start = mid + 1;
                    }
                }
                int b = start;
                return Math.min(a,b);

            }
            if (arr[mid] >arr[mid+1]) {
                end=mid-1;
            }
            if (arr[mid] <arr[mid+1]) {
                start=mid+1;
            }

        }
        return -1;
    }
}
