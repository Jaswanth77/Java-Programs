import java.util.Scanner;
public class Day1_qn4 {

    public static String compressString(String input) {
        StringBuilder compressedString = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressedString.append(input.charAt(i - 1));
                if (count > 1) {
                    compressedString.append(count);
                }
                count = 1;
            }
        }

        compressedString.append(input.charAt(input.length() - 1));
        if (count > 1) {
            compressedString.append(count);
        }

        return compressedString.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String compressed1 = compressString(input1);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + compressed1);
    }
}
