public class Main {
    public static void main(String[] args) {
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4} ));
    }
    public static int isSystematicallyIncreasing(int[] a) {
        int start = 1, startIndex = 0, endIndex = 0;

        if(a[0] != 1)   return 0;

        while (start < a.length) {
            for ( int j = startIndex ; j < endIndex ; j++ ) {
                if(a[j] != j)   return 0;
            }
            startIndex += start;
            endIndex += startIndex;
            start++;
        }

        return 1;
    }
}