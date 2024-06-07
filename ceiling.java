public class ceiling {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'g';
        char ans = selling(arr, target);
        System.out.println(ans);
    }

    static char selling(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (letters[end] == target) {
            return letters[start];
        }
        if (target < letters[start]) {
            return letters[start];
        }
        if (target > letters[end]) {
            return letters[start];
        }


        while (start <= end) {
            // finding middle no.


            int mid = start + (end - start) / 2;
            //comparing chars if middle element is greater than the target
            if (letters[mid] > target) {

                end = mid - 1;

            }
            //comparing chars if middle element is less than the target
            if (letters[mid] < target) {



                start = mid + 1;
            }
            //comparing chars if middle element is equal to the target
            if (letters[mid] == target) {
                return letters[mid + 1];
            }



        }
        return letters[start + 1];
    }

}
