public class perfect_square {
    public static void main(String[] args) {
int num = 808201;
boolean ans = isPerfectSquare(num);
        System.out.println(ans);
    } static boolean isPerfectSquare(int num) {
        long start =0;
        long end = num;
        while(start<end){
            long mid =start+(end-start)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid<num){
                start=mid;
                if(start==mid&&end-start==1){
                    break;
                }
            }
            else{
                end=mid;
            }
        }
        return false;
    }
}
