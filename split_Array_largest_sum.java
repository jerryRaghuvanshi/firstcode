public class split_Array_largest_sum {
    public static void main(String[] args) {

    }public int splitArray(int[] nums, int k) {
int start =0;
int end =0;

        for (int j : nums) {
            start = Math.max(start, j);
            end += j;
        }
        while (start<end){
            int mid = start+(end-start)/2;
            int pieces = 1;
            int sum =0;
            for(int num :nums){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }
                else {
                    sum+=num;
                }
            }
            if(pieces>k){
                start=mid+1;
            }else {
                end=mid;
            }
        }return end;
    }

}
