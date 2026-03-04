package TwoPoiniters;

import java.util.Arrays;

public class DuplicateZeroes {
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void duplicateZeros(int[] arr) {
        int count = 0;
        for (int a=0; a<arr.length;a++){
            if (arr[a] == 0){
                count++;
            }
        }
        int n = arr.length;
        int len = n+count;

        int[] res = new int[len];
        int j=0;
        for(int i = 0; i < n; i++){
            if ( arr[i]!=0){
                res[j] = arr[i];
                j++;
            }
            else{
                res[j] = arr[i];
                j++;
                res[j] = arr[i];
                j++;

            }
        }
        for (int num =0 ; num <n ; num++){
            arr[num] = res[num];

        }

    }
}
