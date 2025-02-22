import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String result = "";
            boolean upperCase = true;

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')) {
                    if (upperCase) {
                        if (currentChar >= 'a' && currentChar <= 'z') {
                            currentChar = (char) (currentChar - 32);
                        }
                    } else {
                        if (currentChar >= 'A' && currentChar <= 'Z') {
                            currentChar = (char) (currentChar + 32);
                        }
                    }
                    result += currentChar;
                    upperCase = !upperCase;
                } else {
                    result += currentChar;
                }
            }

            System.out.println(result);
        }

        scanner.close();
    }
}