public class Main {

    public static void main(String[] args) {
        System.out.println(centered_15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println(centered_15(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println(centered_15(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println(centered_15(new int[]{1, 1, 8, 3, 1, 1}));
        System.out.println(centered_15(new int[]{9, 15, 6}));
        System.out.println(centered_15(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println(centered_15(new int[]{1, 1, 15, -1, -1}));
    }

    public static int centered_15(int[] a) {

        int len = a.length;
        int i = 0;

        int n = 0;

        while (i < len) {

            n += a[i];
//          System.out.println(a[i]);

            if (a[i] == 15) return 1;

            if (n == 15 && len % 2 == 1) return 1;

            i++;

        }


        return 0;
    }

}