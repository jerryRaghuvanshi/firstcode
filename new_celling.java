public class new_celling {
    public static void main(String[] args) {
        char[] arr = {'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n', 'n', 'n'};
        char target = 'n';
        char ans = selling(arr, target);

            System.out.println(ans);

    }

    static char selling(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;

            }
            else {
                start = mid + 1;
            }

        }
        return letters[start%letters.length];
    }
}
