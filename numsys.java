import java.util.Scanner;



public static void main() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the base");
    double base = in.nextInt();

    System.out.println("Enter the number");
    int num = in.nextInt();


    double sum = 0;
    double count =0;
    while (num > 0) {

        int p = num % 10;

         double k = Math.pow(base,count);
         count++;
        sum +=(p*k);
        num = num / 10;
        if (p >= base) {
            System.out.println("number is not valid with the given base");
            break;
        }
    }
    System.out.println("your no. in decimal is : " + sum);


}
