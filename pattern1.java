public class pattern1 {
    public static void main(String[] args) {


        int p=6;
        for ( int i = 1; i <=5 ; i++) {
            p--;
            for ( int k =1; k <=p ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+i);

            }
            System.out.println();
        }
    }
}
