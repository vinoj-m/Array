package TwoPoiniters;
import java.util.*;

public class mergeSortedArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,0,0,0};
        int [] arr2 = {2,5,6};
        merge(arr1,3, arr2 ,3);
        System.out.println(Arrays.toString(arr1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length;
        int j = nums2.length;
        int res=0;

        for (int a = 0; a<m ; a++){
            nums1[res] = nums1[a];
            res++;
        }
        for (int b = 0 ; b<n ; b++){
            nums1[res] = nums2[b];
            res++;
        }
        Arrays.sort(nums1);
    }
}
