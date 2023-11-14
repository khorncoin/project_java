import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1}));
        System.out.println(f(new int[]{1, 2}));
        System.out.println(f(new int[]{1, 2, 3}));
        System.out.println(f(new int[]{1, 2, 3, 4}));
        System.out.println(f(new int[]{3, 3, 4, 4}));
        System.out.println(f(new int[]{3, 2, 3, 4}));
        System.out.println(f(new int[]{4, 1, 2, 3}));
        System.out.println(f(new int[]{1, 1}));
        System.out.println(f(new int[]{}));
    }

    static  int f(int[] a) {
        int sum=0;
        int x = 0;
        int y=0;

        for(int j:a){
          if( j % 2 == 0 ){
              y+=j;
          }
          else {
              x+=j;
          }
        }
        sum = x-y;

        return sum;
    }
}