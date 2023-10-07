// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(sumFactor(new int[]{1, -1, 1, -1, 1, -1, 1}));
        System.out.println(sumFactor(new int[]{1, 2, 3, 4} ));
        System.out.println(sumFactor(new int[]{3, 0, 2, -5, 0}));
        System.out.println(sumFactor(new int[]{9, -3, -3, -1, -1} ));
        System.out.println(sumFactor(new int[]{1}));
        System.out.println(sumFactor(new int[]{0, 0, 0}));

    }

    public static int sumFactor(int[] a)
    {
        int sum = 0, sumfactor = 0;

        for (int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == sum) sumfactor++;

        }
        return sumfactor;
    }

}