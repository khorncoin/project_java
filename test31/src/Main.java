import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRoundedArray(new int[]{-18, 1, 2, 3, 4, 5}, 4)));
    }

    static int[] getRoundedArray(int[] arr, int n) {
        int x = 0;
        int[] newArr = new int[arr.length];

        if (n <= 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++, x++) {
            if (arr[i] < 0) {
                newArr[x] = arr[i];
                continue;
            }
            int val = arr[i] / n;
            int baseValue = n * val;
            newArr[x] = Math.abs(arr[i] - baseValue) < Math.abs(arr[i] - baseValue - n) ? baseValue : baseValue + n;
        }
        return newArr;

    }
}