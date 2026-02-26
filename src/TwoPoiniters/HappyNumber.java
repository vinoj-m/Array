package TwoPoiniters;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 1111111;
        System.out.println(isHappy(n));

    }
    public static boolean isHappy(int n) {


        if (n==1){
            return true;
        }
        if (n==4) return false;
        int sum = 0 ;
        while(n>0){
            int l = n%10 ;
            sum = sum+(l*l);
            n = n/10;

        }



            return isHappy(sum);





    }


}
