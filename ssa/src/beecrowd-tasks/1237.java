import java.util.Scanner;

public class Main {

    public static void lcs(String x, String y) {
        int m = x.length();
        int n = y.length();
        int res = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (x.charAt(i) == y.charAt(j)) {
                    int c = 0;
                    for (int k = 0; (k + i < m) && (k + j < n); k++) {
                        if (x.charAt(k + i) != y.charAt(k + j)) {
                            break;
                        }
                        c++;
                    }
                    if (c > res) {
                        res = c;
                    }
                }
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String um, dois;

        while (sc.hasNextLine()) {
            um = sc.nextLine();
            dois = sc.nextLine();
            lcs(um, dois);
        }

        sc.close();
    }
}
