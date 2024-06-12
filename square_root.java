public class square_root {
    public static void main(String[] args) {
        int x=2147395599;
        int ans = root(x);
        System.out.println(ans);
    }
    static int root (int x){

       long start=0;
       long end = x;

       while (start<=end){
           long  mid = start+(end-start)/2;
           if(x==1){
               return 1;
           }
           if (mid*mid>x){
               end=mid;
           }
           if (mid*mid<x){
               start=mid;

           }
           if (mid*mid==x){
               return (int) mid;
           }
           if (end-start==1 && start==mid){
               return (int) start;
           }

       }


        return (int) start;
    }
}
