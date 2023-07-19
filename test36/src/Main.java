public class Main {
    public static void main(String[] args) {

        System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
    }
    public static int decodeArray(int[] a)
    {
        int decodenumber = 0;
        int Positive = 1;
        int zerocount = 0;
        int ten = 1;
        for (int i = 0; i < a.length; i++)
        {
            if (i == 0)
            {
                if (a[i] < 0) Positive = a[i];
            }

            if (a[i] == 0)
                zerocount++;
            else
            {
                if (zerocount > 0)
                {
                    decodenumber = decodenumber * ten;
                    decodenumber += zerocount;
                    zerocount = 0;
                    ten = 10;
                }
                else
                {
                    decodenumber = decodenumber * ten;
                    decodenumber += 0;
                    ten = 10;
                }
            }
        }
        decodenumber = decodenumber * Positive;
        return decodenumber;
    }


}