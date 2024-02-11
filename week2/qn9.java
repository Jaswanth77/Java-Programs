package placementcode;
import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sathi
 */
public class qn9 {
    public static void main(String[] args)
    {
        int[] arr = {1,3,4,5,9,6};
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j] == arr[i]+1)
                {
                    System.out.print(arr[j]);
                    break;
                }
            }
            System.out.print("_");
        }
        
    }
    
}
