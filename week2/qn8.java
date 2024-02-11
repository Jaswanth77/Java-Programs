/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placementcode;

import java.util.Arrays;

public class qn8 {
    public static void main(String[] args) {
        String str1 = "bat";
        String str2 = "tree";
        int len1 = str1.length();
        int len2 = str2.length();
        char[] ans = new char[len1 + len2];
        int st = 0, end = 0;
        for (int i = 0; i < len1; i++) {
            ans[i] = str1.charAt(i);
        }
        if (ans[len1 - 1] == str2.charAt(0)) {
            st = len1;
            end = len1 + len2;
        } else {
            ans[len1] = str2.charAt(0);
            st = len1;
            end = len1 + len2;
        }
        for (int i = st + 1; i < end; i++) {
            ans[i] = str2.charAt(i - st);
        }
        System.out.println(ans);
    }
}
