// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[]{11,-5,-4,20}));
    }

    static int countSquarePairs(int[] a) {
        int countSquarePairs = 0;
        for (int i = 1; i < a.length; i++){
            for (int j = 0; j < i; j++) {
                if (a[i] <= 0) break;
                if (a[j] <= 0) continue;
                if (isPerfectSquare(a[i] + a[j]) == 1)
                    countSquarePairs++;
            }
        }
        return countSquarePairs;
    }

    static int isPerfectSquare(int number) {
        int isPerfectSquare = 0;
        for (int i = 0; i < number/2; i++) {
            if (i * i == number) {
                isPerfectSquare = 1;
                break;
            }
        }
        return isPerfectSquare;
    }
}