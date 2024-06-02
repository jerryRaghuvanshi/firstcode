import java.util.Scanner;

public class harshu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String input = inp.next();

        char var = inp.next().charAt(0);
        boolean ans = men(input, var);
        System.out.println(ans);
    }

    static boolean men(String a, char b) {
        for (int i = 0; i < (a.length()); i++) {
            if (b == a.charAt(i)) {
                return true;
            }


        }
        return false;

    }
}
