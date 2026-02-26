package TwoPoiniters;

public class reverseString {
    public static void main(String[] args) {
        char[] s = {'v','i' , 'n' };

        System.out.println(reverse(s));
    }
    public static char[] reverse( char[] s){
        if (s== null || s.length == 0){
            return new char[0];
        }
        int i = 0;
        int j = s.length -1;

        while (i<=j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp ;
            i++;
            j--;
        }
        return  s;
    }
}
