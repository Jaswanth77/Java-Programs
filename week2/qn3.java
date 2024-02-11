/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package placementcode;
import java.util.Arrays;
/**
 *
 * @author sathi
 */
public class qn3 {
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,1,5,3};
        int[] arr2 = {5,8,7,4};
        
        int[] result = Substract(arr1,arr2);
        System.out.println("RESULT:");
        for(int x:result)
        {
           System.out.print(x+",");
        }
    }
    
    static int[] Substract(int[] arr1,int[] arr2)
    {
        long n1 = 0;
        long n2 = 0;
        long res;
        
        for(int x:arr1)
        {
            n1=n1*10+x;
        }
        for(int x:arr2)
        {
            n2=n2*10+x;
        }
        if(n1>n2)
        {
            res = n1-n2;
        }
        else
        {
            res = n2-n1;
        }
        System.out.println(res);
        int i=0;
        int len = (int)Math.log(res)+1;
        int[] result = new int[len];
        System.out.println(len);
        while(res>0)
        {
            result[len--] = (int) res%10;
            res = res/10;
        }
        return result;
    }
}
