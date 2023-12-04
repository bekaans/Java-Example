import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner komb = new Scanner(System.in);
int total1=1;
int total2=1;
int total3=1;
int endpoint ;


        System.out.println("Entry the first number :"); int fnumber= komb.nextInt();
        System.out.println("Entry the second number :"); int snumber= komb.nextInt();

        for (int i=1 ; i <=fnumber;i++)
        {
            total1 = total1 * i;
        }


        for (int j=1 ; j <=snumber;j++)
        {
            total2 = total2 * j;
        }

        double tnumber = fnumber-snumber;

        for(int k=1;k<=tnumber;k++)
        {
            total3 = total3 * k ;
        }

        endpoint = total1/(total2*total3);
        System.out.println(endpoint);


    }
}