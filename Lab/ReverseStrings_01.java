package TextProcessing.Lab;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.next();
            if (word.equals("end")) {
                break;
            }
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.printf("%s = %s\n", word, reversed);
        }
    }
}