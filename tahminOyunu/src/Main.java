import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
        Random rand = new Random();
        int[] wrongg = new int[5];
        int number = rand.nextInt(100);
        System.out.println(number);
        int guess;
        int right=5;
        int wrong=0;
        boolean isTrue ;

        while(right!=0){

            guess=inp.nextInt();


            if (guess>number && guess<100){
                right--;
                System.out.println("Girdiğiniz sayı şanslı sayıdan büyüktür ...Kalan hak :"+right);
                isTrue=false;
            }
            else if (guess==number) {

                System.out.println("Tebrikler ... Doğru Sayıyı Girdiniz ve oyunu "+right+" hak ile tamamladınız .");
                break;

            }

            else if (guess<number)
            {   right--;
                System.out.println("Girdiğiniz sayı şanslı sayıdan küçüktür...Kalan hak :"+right);
            }
            else if(guess>=100){

                System.out.println("Hatalı sayı girdiniz. Lütfen 1-100 arası bir sayı giriniz.Birdahaki hatalı girişte hak gidecektir");
                    wrong++;
                   if(wrong>1){
                       right--;
                       System.out.println("Hatalı sayı girdiniz. Lütfen 1-100 arası bir sayı giriniz.Kalan Hak :"+right);
                }
                    }

            if (right==0) {
                System.out.println("Hakkınız bitti yeniden deneyiniz");
                break;
            }

        }}
        }







    
