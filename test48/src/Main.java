// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isFibonacci(34));
    }
    public static int isFibonacci(int n)
    {
        int isFibonacci = 0;

        int a = 0, b = 1, c = a + b;

        do
        {
            a = b;
            b = c;
            c = a + b;
            if (c == n)
                isFibonacci = 1;
        } while (c <=n && isFibonacci==0);

        return isFibonacci;
    }
}