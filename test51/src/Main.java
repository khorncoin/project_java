public class Main {
    public static void main(String[] args) {

        System.out.println(is235Array(new int[] { 2, 3, 5, 2, 2} ));

    }
    public static int is235Array(int[] a)
    {
        int is235Array = 0;
        int div2count = 0, div3count = 0, div5count = 0, othercount = 0;
        for (int i = 0; i < a.length; i++)
        {
            boolean isother = true;
            int current = a[i];
            if (isDivisibleBy(current, 2))
            {
                div2count++;
                isother = false;
            }
            if (isDivisibleBy(current, 3))
            {
                div3count++;
                isother = false;
            }
            if (isDivisibleBy(current, 5))
            {
                div5count++;
                isother = false;
            }
            if (isother)
                othercount++;

        }

        if (div2count + div3count + div5count + othercount == a.length)
            is235Array = 1;
        return is235Array;
    }

    public static boolean isDivisibleBy(int number,int by)
    {
        return (number % by == 0);
    }
}