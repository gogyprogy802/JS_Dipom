public class method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int result = areaOfRectangle(a, b);
    }

    public static int areaOfRectangle(int a, int b) { //передаем тот тип, указанный в методе
        int result = a * b;
        return result;

        System.out.println();
    }
}