import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    if(j < i){
                        break;
                    }
                    count++;
                }
            }
            if(count > 0){

                System.out.printf("%d sayisi %d kere yazilmistir.\n", arr[i], count);
                count = 0;
            }
        }
    }
}