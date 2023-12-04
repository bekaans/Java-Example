import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);


                System.out.print("Enter the Array Value n :");
                int n= input.nextInt();
                int arr [] = new int[n];


            for (int i=0 ; i<n ; i++)
            {

                System.out.print("Enter the Number "+(i+1)+":");
                arr[i]= input.nextInt();
            }
                Arrays.sort(arr);
                System.out.println("Array Min To Max :"+Arrays.toString(arr));

    }
}



