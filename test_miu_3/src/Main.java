
public class Main {
    public static void main(String[] args) {

        System.out.println(isOlympic(new int[]{3, 2, 1}));
        System.out.println(isOlympic(new int[]{2, 2, 1, 1}));
        System.out.println(isOlympic(new int[]{1, 1000, 100, 10000, 2}));
        System.out.println(isOlympic(new int[]{1, 2, 1, 3, 2}));
        System.out.println(isOlympic(new int[]{1, 2, -1, 2, 2}));
    }
     static int isOlympic(int[] a)
    {
        int len = a.length;
        for (int i = 0; i < len; i++)
        {
            int sum = 0;
            for (int j = 0; j < len; j++)
            {
                if (a[j] < a[i])
                    sum += a[j];
            }
            if (a[i] < sum)
                return 0;
        }
        return 1;
    }
}