package TwoPoiniters;
import java.util.Arrays;

public class Operations {
    public static void main(String[] args) {
        int [] arr = {1,2,2,1,1,0};
        System.out.println(Arrays.toString(applyOperations(arr)));
    }
    public static int[] applyOperations(int[] nums) {

        int i=0;
        int j=1;

        while(i< nums.length && j <nums.length){
            if(nums[i] == nums[j]){
                nums[i] *= 2;
                nums[j] = 0;

            }
            i++;
            j++;
        }
        int [] res = new int[nums.length];
        int a=0;
        for ( int b=0 ; b < nums.length ; b++){
            if(nums[b] != 0){
                res[a] = nums [b];
                a++;
            }
        }

        return res;

    }
}
