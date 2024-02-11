/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placementcode;

import java.util.Arrays;
import java.util.Scanner;

public class qn7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = in.nextInt();
        int arr[] = new int[n];
        int po = 0, ne = 0;
        System.out.println("Enter the elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] < 0) {
                ne++;
            } else {
                po++;
            }
        }
        Arrays.sort(arr);
        int[] neg = new int[ne];
        int[] pos = new int[po];
        // System.out.println(po);
        // System.out.println(ne);
        for (int i = 0; i < ne; i++) {
            neg[i] = arr[i];
        }
        int k = 0;
        for (int i = ne; i < ne + po; i++) {
            pos[k++] = arr[i];
        }
        // System.out.println(Arrays.toString(pos));
        // System.out.println(Arrays.toString(neg));
        if (ne == 1) {
            System.out.println(pos[0] * pos[1] * neg[0]);
        } else if (po == 1) {
            System.out.println(neg[0] * neg[1] * pos[0]);
        } else {
            int temp1 = pos[0] * pos[1] * neg[1];
            int temp2 = pos[0] * neg[0] * neg[1];
            System.out.println(temp1 + " " + temp2);
            System.out.println(Math.min(temp1, temp2));
        }
    }
}