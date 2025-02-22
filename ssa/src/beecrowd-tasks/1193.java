

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            String number = scanner.next();
            String base = scanner.next();

            System.out.println("Case " + i + ":");

            switch (base) {
                case "bin":
                    int decimalFromBin = Integer.parseInt(number, 2);
                    System.out.println(decimalFromBin + " dec");
                    System.out.println(Integer.toHexString(decimalFromBin) + " hex");
                    break;

                case "dec":
                    int decimal = Integer.parseInt(number);
                    System.out.println(Integer.toHexString(decimal) + " hex");
                    System.out.println(Integer.toBinaryString(decimal) + " bin");
                    break;

                case "hex":
                    int decimalFromHex = Integer.parseInt(number, 16);
                    System.out.println(decimalFromHex + " dec");
                    System.out.println(Integer.toBinaryString(decimalFromHex) + " bin");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}