// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(isSelfReferential(new int[]{2, 0, 0}));
        System.out.println(isSelfReferential(new int[]{0}));
        System.out.println(isSelfReferential(new int[]{1}));
        System.out.println(isSelfReferential(new int[]{1, 2, 1, 0}));
        System.out.println(isSelfReferential(new int[]{2, 0, 2, 0}));
        System.out.println(isSelfReferential(new int[]{2, 1, 2, 0, 0}));
        System.out.println(isSelfReferential(new int[]{3, 2, 1, 1, 0, 0, 0}));
        System.out.println(isSelfReferential(new int[]{4, 2, 1, 0, 1, 0, 0, 0}));
        System.out.println(isSelfReferential(new int[]{5, 2, 1, 0, 0, 1, 0, 0, 0}));
        System.out.println(isSelfReferential(new int[]{6, 2, 1, 0, 0, 0, 1, 0, 0, 0}));

    }

    static int isSelfReferential(int[] a) {
        if(a == null || a.length == 0)
            return 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j=0;j<a.length;j++) {
                if (a[j] == i)
                    count++;
            }
            if(count != a[i])
                return 0;
        }

        return 1;
    }

}