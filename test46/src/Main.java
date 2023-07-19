
public class Main {
    public static void main(String[] args) {
        System.out.println(isVesuvian( 10));
    }
    public static int isVesuvian(int n)
    {
        int isVesuvian = 0;

        int paircount = 0;
        for (int i = 0; i < n && isVesuvian == 0; i++)
        {
            if (isPerfectSquare(i))// is square
            {
                for (int j = 0; j < n && isVesuvian == 0; j++)
                {
                    if (isPerfectSquare(j))
                    {
                        if (i + j == n)
                            paircount++;
                        if (paircount == 2)
                            isVesuvian = 1;
                    }
                }
            }
        }

        return isVesuvian;
    }

    public static boolean isPerfectSquare(int n)
    {
        double sqrt = Math.sqrt(n);
        return (sqrt == Math.floor(sqrt));
    }


}