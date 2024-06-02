import java.util.Scanner;

public class minvaluein2darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int row = in.nextInt();

        System.out.println("Enter the no. of columns");
        int columns = in.nextInt();
        int[][] arr = new int[row][columns];
        System.out.println("Enter the array elements");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        int ans = min(arr,row,columns);
        System.out.println(ans );
    }
    static int min(int[][] arr,int row, int column){
        int k = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <column ; j++) {

                if (arr[i][j]<=k) {
                    k=arr[i][j];
                }
            }
        }
        return k;
    }

}