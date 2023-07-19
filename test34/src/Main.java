
public class Main {
    public static void main(String[] args) {
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0,0,0,2, 0,0,0,0,0,0, 2, 0, 0, 0, 0}));
    }

    public static int isZeroPlentiful(int[] a)
    {
        int isZero = 1;
        int count = 0;
        int zerocount = 0;
        for (int i = 0; i < a.length && isZero==1 ; i++)
        {
            int current = a[i];
            if (current == 0)
                zerocount++;
            else if (zerocount >= 4) { count++; zerocount = 0; isZero = 1; }
            else if (zerocount > 0) isZero = 0;


            if(i == a.length - 1)
            {
                if (zerocount >= 4) { count++; zerocount = 0; }

            }
        }



        if (isZero == 1) isZero = count;
        return isZero;
    }

}