import java.util.Scanner;

public class tillu {
    public static void main(String[] args) {
        System.out.println("enter string");
        Scanner inp = new Scanner(System.in);
        String lele = inp.next();
        Scanner ip = new Scanner(System.in);
        char target = (char) ip.nextShort();
        int ans = newf(lele,target);
        System.out.println(ans);
    }
    static int newf (String a,char target) {
        if (a.isEmpty()){
            return -1;
        }
        for (int i = 0; i <a.length() ; i++) {

            if (a.charAt(i)==target){
                return i+1;
            }


        }
        return -1;
    }
}
