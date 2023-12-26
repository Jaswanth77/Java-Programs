import java.text.DecimalFormat;
import java.util.Scanner;
public class Day1_qn1b {
    public static final DecimalFormat deci = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,b,avg;
        System.out.println("Enter two floating numbers");
        a = in.nextFloat();
        b = in.nextFloat();
        avg = (a+b)/2;
        System.out.println("Average:"+deci.format(avg));
    }
}
