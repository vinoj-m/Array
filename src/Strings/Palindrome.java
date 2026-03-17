
package Strings;
import java.util.* ;
public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

        String result = s.replaceAll("[^a-zA-Z0-9]", "");

        int left =0;
        int right = result.length()-1;
        String a = result.toLowerCase();

        while (left<=right){
            if(a.charAt(left) != a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
