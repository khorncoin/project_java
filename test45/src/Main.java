public class Main {
    public static void main(String[] args) {
        System.out.println(closestFibonacci(100));
    }
    public static int closestFibonacci(int n)
    {
        int closestFibonacci = 0;
        if (n > 0)
        {
            int a = 0, b = 1, c = a + b;

            do
            {
                a = b;
                b = c;
                c = a + b;
                if (c >= n)
                {
                    closestFibonacci = b;
                }
            } while (c <= n);
        }
        return closestFibonacci;
    }
}