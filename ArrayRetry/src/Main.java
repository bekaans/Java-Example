import java.sql.Array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] list  = {1,1,2,2,4,5,6,7,8,8,9,10,10,11,11,12,12,13,14,15,16,16};
for (int i=0 ; i< list.length ; i++){
    for (int j=0 ; j< i ; j++){

        if (list[j]==list[i])
        {
            if (list[j]%2==0 && list[i]%2==0)
            {
            System.out.println(list[j]);
            }
        }
    }
}
    }
}