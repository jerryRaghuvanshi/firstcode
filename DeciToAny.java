import java.util.*;

public class DeciToAny {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number in Decimal");
        int num = in.nextInt();
        System.out.println("Enter the base");
        int base = in.nextInt();
        int p;
        List <Integer> list = new ArrayList<>();
        while(num>0){
            p = num%base;
            list.add(p);
            num/=  base;
        }

        Collections.reverse(list);
       StringBuilder firstBuild = new StringBuilder();
       for (int digit : list){
           firstBuild.append(digit);
       }
        System.out.println(firstBuild);
    }

}
