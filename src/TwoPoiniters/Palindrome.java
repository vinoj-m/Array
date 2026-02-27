package TwoPoiniters;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(palindrome(121));

    }
    public static boolean palindrome(int x) {
        int a = x;
        int res = 0;
        while(x>0){
            int digit = x%10;
            res = (res*10)+digit;
            x = x/10;
        }
        if (a==res){
            return true;
        }
        return false;
    }
}
