public class Main {
    public static void main(String[] args) {
        System.out.println(loopSum(new int[]{1, 4, 5, 6},4));
    }

    public static int loopSum(int [] a, int n){
        int sum = 0,j=0;
        if (n > 0)
        {
            for (int i = 0; i<n; i++)
            {
                if (j >= a.length)
                {
                    j = 0;
                }
                sum += a[j];
                j++;
            }
        }
        return sum;
    }

}