import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner bks = new Scanner(System.in);


        System.out.print("MATRİS :");
        int[][] matris = new int[2][3];
int number =1;
        for (int i=0 ; i< matris.length ; i++){
            System.out.println();
            for (int j=0 ; j< matris[i].length ; j++){
                matris[i][j] = number ++ ;
                System.out.print(matris[i][j]);
            }
        }
        int[][] matris1 = new int[3][2];
        System.out.println("\nTRANSPOZ :");
int number2=1;
        for (int i=0 ; i< (matris1.length); i++){
            System.out.println();


            for (int j=0 ; j< (matris1[i].length) ; j++){

                matris1[i][j]= number2++;
                System.out.print(matris1[i][j]);

            }





    }
}}