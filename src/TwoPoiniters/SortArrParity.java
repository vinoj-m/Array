package TwoPoiniters;

public class SortArrParity {
    public static void main(String[] args) {
        System.out.println();
    }
    public int[] sortArrayByParityII(int[] nums) {

        int [] res = new int [nums.length];
        int oddIndex = 1;
        int evenIndex = 0;
        for (int i=0 ; i <nums.length; i++){
            if(nums[i] %2 == 0){
                res[evenIndex] = nums[i];
                evenIndex = evenIndex+2;
            }else{
                res[oddIndex] = nums[i];
                oddIndex = oddIndex+2;
            }

        }
        return res;
    }

}
