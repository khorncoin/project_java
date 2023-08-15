// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number = 24;
//        int number = 105;
//        int number = 90;
//        int number = 23;
//        int number = 15;
//        int number = 2;
//        int number = 0;
//        int number = -12;
        System.out.println(isConsecutiveFactored(number));
    }

    static int isConsecutiveFactored(int n) {
        int[] arr = new int[getCountOfFactorsOfNumberN(n)];
        int[] actArray = getArrayOfFactorNumbers(n, arr);
        int len = actArray.length;

        if (n <= 0) return 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] < 1 || arr[i + 1] < 1) {
                return 0;
            }
            if (actArray[i + 1] == actArray[i] + 1) {
                return 1;
            }
        }
        return 0;

    }

    static int getCountOfFactorsOfNumberN(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    static int[] getArrayOfFactorNumbers(int n, int[] arr) {
        int j = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }
}