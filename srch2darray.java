import java.util.*;

public class srch2darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int row = in.nextInt();
        System.out.println("Enter the no. of columns");
        int column = in.nextInt();

        int[][] two = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                two[i][j] = in.nextInt();
            }

        }
       
        System.out.println(" Now enter target no.");
        int target = in.nextInt();
        List<int[]> ans = search(row, column, two, target);

        if (ans.isEmpty()) {
            System.out.println("Target not found");
        } else {

            System.out.println("your target is at ");
            for (int[] positions : ans) {
                System.out.println(Arrays.toString(positions));
            }
        }

    }

    static List<int[]> search(int row, int column, int[][] arr, int target) {
        List<int[]> positions = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {


                if (arr[i][j] == target) {
                    positions.add(new int[]{i + 1, j + 1});
                }

            }

        }
        return positions;
    }

}
