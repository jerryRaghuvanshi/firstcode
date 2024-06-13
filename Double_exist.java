public class Double_exist {
    public static void main(String[] args) {
int [] nums ={3,3,7,7,10,11,11};
int ans =exist(nums);
        System.out.println(ans);
    }

    static int exist(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        if(end==0){
            return nums[end];
        }
        while (start <= end) {
            if (nums[start] == nums[start + 1]) {
                start += 2;
            } else {
                return nums[start];
            }
            if (nums[end] == nums[end - 1] ) {
                end -= 2;
            } else {
                return nums[end];
            }

        }
        return -1;



    }
}
