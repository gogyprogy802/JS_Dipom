import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().toLowerCase();

            int[] letterCount = new int[26];

            // Проходим по каждому символу
            for (int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);

                if (ch >= 'a' && ch <= 'z') {
                    letterCount[ch - 'a']++;
                }
            }

            int maxCount = 0;
            for (int count : letterCount) {
                if (count > maxCount) {
                    maxCount = count;
                }
            }

            StringBuilder result = new StringBuilder();
            for (int k = 0; k < 26; k++) {
                if (letterCount[k] == maxCount) {
                    result.append((char) (k + 'a'));
                }
            }

            System.out.println(result);
        }

        scanner.close();
    }
}