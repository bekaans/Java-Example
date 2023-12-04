import java.util.Scanner;
public class Main {

    static boolean isPalindrome(String str) {
        Scanner inp = new Scanner(System.in);
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;



        }return true;


    }

    public static void main(String[] args) {


        System.out.println(isPalindrome("kayak"));


    }
}