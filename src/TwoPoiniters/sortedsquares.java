package TwoPoiniters;
import java.util.*;

public class sortedsquares {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int arr[] = new int [len];
        int j = 0 ;
        for (int i =0 ; i<nums.length ; i++){
            int result = nums[i]*nums[i];
            arr[j++] = result ;
        }

        Arrays.sort(arr);
        return arr;
    }
}
