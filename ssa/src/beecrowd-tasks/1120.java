import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num, Nu, r_num;

        while (true) {
            num = sc.next();
            Nu = sc.next();

            if (num.equals("0") && Nu.equals("0")) {
                break;
            }

            r_num = Nu.replace(num, "");

            r_num = r_num.replaceFirst("^0+", "");

            if (r_num.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(r_num);
            }
        }

        sc.close();
    }
}
