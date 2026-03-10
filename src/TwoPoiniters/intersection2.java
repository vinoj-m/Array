package TwoPoiniters;
import java.util.*;

public class intersection2 {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};
        System.out.println(intersect(nums1 , nums2));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
        List <Integer> set = new ArrayList<>();
        while(i<nums1.length && j< nums2.length){
            if (nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] res = new int[set.size()];
        for ( int a =0 ; a <set.size() ; a++){
            res[a] = set.get(a);
        }

        return res;
    }
}
