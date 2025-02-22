import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            String a = sc.next();
            int b = sc.nextInt();
            int c = a.length();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < c; i++) {
                int d = a.charAt(i) - b;
                if (d < 65) {
                    d = 91 - (65 - d);
                }
                result.append((char) d);
            }

            System.out.println(result);
        }
        sc.close();
    }
}
