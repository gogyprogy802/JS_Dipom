import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, dias;
        float x;

        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            x = scanner.nextFloat();
            dias = 0;
            while (x > 1) {
                x /= 2;
                dias++;
            }
            System.out.println(dias + " dias");
        }

        scanner.close();
    }
}