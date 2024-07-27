import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AnyToAny {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base you have");
        double base = in.nextInt();

        System.out.println("Enter the number you have");
        int num = in.nextInt();
        System.out.println("Enter the base you want to convert in");
        int base1 = in.nextInt();


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


        int p;
        List<Integer> list = new ArrayList<>();
        while(sum>0){
            p = (int) (sum%base1);
            list.add(p);
            sum = (int)(sum /  base1);
        }

        Collections.reverse(list);
        StringBuilder firstBuild = new StringBuilder();
        for (int digit : list){
            firstBuild.append(digit);
        }
        System.out.println(firstBuild);
    }
}
