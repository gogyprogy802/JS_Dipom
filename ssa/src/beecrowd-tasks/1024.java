import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            StringBuilder encrypted = new StringBuilder();

            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);
                if (Character.isLetter(ch)) {
                    ch += 3;
                }
                encrypted.append(ch);
            }

            encrypted.reverse();

            for (int j = encrypted.length() / 2; j < encrypted.length(); j++) {
                char ch = encrypted.charAt(j);
                ch -= 1;
                encrypted.setCharAt(j, ch);
            }

            System.out.println(encrypted.toString());
        }

        sc.close();
    }
}
