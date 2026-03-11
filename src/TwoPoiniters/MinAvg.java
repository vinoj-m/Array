package TwoPoiniters;
import java.util.*;

public class MinAvg {
    public static void main(String[] args) {
        int nums [] = {7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(nums));
    }

    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int left =0;
        int right = nums.length-1;

        double minavg = Arrays.stream(nums).max().getAsInt();
        double minavg1 = Double.MAX_VALUE;
        while (left < right){
            double avg = (nums[left] + nums[right])/2.0;
            minavg = Math.min(avg , minavg);

            left++;
            right--;
        }


    return minavg;
    }
}
