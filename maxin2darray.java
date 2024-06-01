import java.util.Scanner;



public class maxin2darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int row = in.nextInt();

        System.out.println("Enter the no. of columns");
        int columns = in.nextInt();
        int [][] arr = new int[row][columns];
        System.out.println("Enter the array elements");

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <columns ; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int ans = max(arr,row,columns);
        System.out.println(ans);
        in.close();

    }
    static int max(int[][] arr,int row,int column){
        int k = Integer.MIN_VALUE;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if (k < arr[i][j]) {
                    k = arr[i][j];
                }
            }

        }
        return k;
    }
}
