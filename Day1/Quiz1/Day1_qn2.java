import java.util.Scanner;
public class Day1_qn2 {
    public static void calculator(int a, int b, char c)
    {
        if(c == '+')
            System.out.println("sum:"+(a+b));
        else if(c == '-')
            System.out.println("sub:"+(a-b));
        else if(c == '*')
            System.out.println("mul:"+(a*b));
        else if(c == '/')
        {
            if(b == 0)
                System.out.println("zero division error");
            else
                System.out.println("div:"+(a/b));
        }
        else
            System.out.println("enter correct operator");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        char c;
        System.out.println("Enter a and b:");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("Enter operator(+,_,*,/):");
        c = in.next().charAt(0);
        calculator(a,b,c);
    }
}
