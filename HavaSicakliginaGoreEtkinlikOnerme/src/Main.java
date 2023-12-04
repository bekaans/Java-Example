
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz");
        int sicaklik = input.nextInt();
        if (sicaklik < 5) {
            System.out.println("Kayak Yap");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinemaya Git");
        } else if (sicaklik >= 15 && sicaklik <= 25) {
            System.out.println("Pikniğe Git");
        } else if (sicaklik > 25) {
            System.out.println("Yüzme Yapabilirsn");
        }
    }
}