import java.util.Scanner;
public class Main {

    static boolean isPalindrom(int number) {

        int source = number, lastnumber;
        int newnumber = 0;

        while (source != 0)
        {
            lastnumber = source % 10;
            newnumber = newnumber * 10 + lastnumber;

            source/=10;
        }

        if (newnumber==number)
        {
            System.out.println("This is Paligron number");
        }

        else
        {
            System.out.println("This is not Paligron number");
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int number=1 ;
        System.out.println("-------------------------------------------------");
        System.out.println("If u write 0 , the program ll be end");
        System.out.println("--------------------------------------------------");

        while (number!=0)
        {
        System.out.print("Enter The Number :");
        number = input.nextInt();
        isPalindrom(number);
        }

}}