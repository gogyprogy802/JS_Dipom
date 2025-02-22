
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a == 0 && b == 0)
            {
                break;
            }
            int[] arr = new int[10];
            for (int i = a; i <= b; i++)
            {
                int temp = i;
                while(temp != 0)
                {
                    int t = temp%10;
                    arr[t]++;
                    temp = temp/10;
                }
            }

            for (int i = 0; i < arr.length; i++)
            {
                if (i == arr.length-1)
                    System.out.print(arr[i]);
                else
                    System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}