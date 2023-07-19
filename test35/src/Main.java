public class Main {
    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(7));
    }


    public static int isDigitIncreasing(int n)
    {
        int isDigitI = 0;

        int digitcount = 0;
        int tempn = n;
        do
        {
            tempn = tempn / 10;
            digitcount++;
        } while (tempn >=1);

        for (int i = 1; i <= 9 && isDigitI == 0; i++)
        {
            int sum = 0;
            int digit = 0;

            for (int j = 1; j <= digitcount; j++)
            {
                int ten = 1;
                if (j > 1)
                    ten *= 10;
                sum = sum * ten;
                sum += i;

                digit += sum;
            }

            if (digit == n) isDigitI = 1;
        }

        return isDigitI;
    }

}