/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placementcode;

/**
 *
 * @author sathi
 */
public class qn10 {
     public static void main(String[] args)
     {
         String word = "Hi # Good morning";
         System.out.println("reversal:"+ReverseAlphaNum(word));
     }
     
     static String ReverseAlphaNum(String s)
     {
         char[] letters = s.toCharArray();
         int start = 0;
         int end = letters.length - 1;
         
         char[] result = new char[end+1];
         
         while(start<=end)
         {
             if(((letters[start]>=65 && letters[start]<=91) || (letters[start]>=97 && letters[start]<=123) || (letters[start]>=48 && letters[start]<=57)) && ((letters[end]>=65 && letters[end]<=91) || (letters[end]>=97 && letters[end]<=123) || (letters[end]>=48 && letters[end]<=57)))
             {
                 result[start] = letters[end];
                 result[end] = letters[start];
//                 System.out.println("start"+start+"    "+"end"+end);
//                 System.out.println("start:"+result[start]+"    "+"end:"+result[end]);
                 start++;
                 end--;
             }
             else if((letters[start]>=65 && letters[start]<=91) || (letters[start]>=97 && letters[start]<=123) || (letters[start]>=48 && letters[start]<=57))
             {
                 result[end] = letters[end];
//                 System.out.println(result[end]);
                 end --;
             }
             else
             {
                 result[start] = letters[start];
//                 System.out.println(result[start]);
                 start++;
             }
         }
         return result.toString();
         
     }
}
