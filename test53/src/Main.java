
public class Main {
    public static void main(String[] args) {

        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));

    }

    static int isMartian(int[] a) {

        int countOne = 0;
        int countTwo = 0;
        int len = a.length;

        if (len == 0) {
            return 0;
        }

        if (len == 1) {
            return a[0] == 1 ? 1 : 0;
        }

        for (int i = 0; i < len; i++) {
            if (i != len - 1) {
                if (a[i] == a[i + 1]) {
                    return 0;
                }
            }

            if (i == len - 2) {
                if (a[i] == a[len - 1]) {
                    return 0;
                }
            }
            if (a[i] == 1) {
                countOne++;
            }

            if (a[i] == 2) {
                countTwo++;
            }
        }

        if (countOne > countTwo) {
            return 1;
        }
        return 0;
    }

}
