public class Arranging_coins {
    public static void main(String[] args) {
        int n=9;
        int ans=coins(n);
        System.out.println(ans);
    }
    static int coins(int n){
        int start =1;

        int mid = start+(n -start)/2;
        if(n<5){
            return mid;
        }
        return mid-1;


    }
}
