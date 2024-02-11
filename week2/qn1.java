import java.util.Arrays;
import java.util.Scanner;

public class qn1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = in.nextInt();
        int sum = 0;
        while (num != 0) {
            int temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }
        System.out.println("SUM  :" + sum);
    }
}