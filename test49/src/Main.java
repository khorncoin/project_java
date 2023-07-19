// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isTriangular(15));
    }
    public static int isTriangular(int n)
    {
        int isTriangular = 0;


        int sum = 0;

        for (int j = 0; j <= n && isTriangular==0; j++)
        {
            sum += j;
            if(sum == n)
            {
                isTriangular = 1;
            }
        }

        return isTriangular;
    }
}