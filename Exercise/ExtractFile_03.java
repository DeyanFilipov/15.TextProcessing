package TextProcessing.Exercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int endIndex = input.indexOf(".");
        int startIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\\') {
                startIndex = i + 1;
            }
        }
        String fileName = input.substring(startIndex, endIndex);
        String fileType = input.substring(endIndex + 1);

        System.out.printf("File name: %s\n", fileName);
        System.out.printf("File extension: %s", fileType);
    }
}
