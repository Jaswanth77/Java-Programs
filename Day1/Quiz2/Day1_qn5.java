import java.util.Scanner;
public class Day1_qn5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[15];
        int[] odd = new int[15];
        int[] even = new int[15];
        int a,i,n,o=0,e=0;
        System.out.println("Enter no. of elements:");
        a = in.nextInt();
        System.out.println("Enter elements:");
        for(i=0;i<a;i++)
        {
            n = in.nextInt();
            arr[i] = n;
        }
        for(i=0;i<a;i++)
        {
            if(arr[i]%2 == 0)
            {
                even[o++] = arr[i];
            }
            else
            {
                odd[e++] = arr[i];
            }
        }
        System.out.println("Odd:");
        for(i=0;i<o;i++)
        {
            System.out.print(odd[i]+",");
        }
        System.out.println("Even:");
        for(i=0;i<e;i++)
        {
            System.out.print(even[i]+",");
        }

    }
}
