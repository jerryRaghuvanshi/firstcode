import java.util.ArrayList;


public class welthiest_one {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2}, {4, 2, 1}};

        int ans = acc(accounts);
        System.out.println(ans);
    }

    static int acc(int[][] accounts) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = 0;
        for (int[] account : accounts) {

            for (int i : account) {
                k = k + i;


            }
            list.add(k);
            k=0;
        }



return max_in_arraylist(list);


    }

    static int max_in_arraylist(ArrayList<Integer> arr) {
        int p = arr.getFirst();
        for (Integer integer : arr) {
            if (integer >= p) {
                p = integer;
            }
        }
        return p;
    }
}
