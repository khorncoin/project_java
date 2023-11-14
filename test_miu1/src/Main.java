public class Main {
    public static void main(String[] args) {
        System.out.println(function(new int[]{1, 2, 3, 4, 5}));
        System.out.println(function(new int[]{3, 2, 1, 4, 5}));
        System.out.println(function(new int[]{3, 2, 1, 4, 1}));
        System.out.println(function(new int[]{1, 2, 3, 4}));
        System.out.println(function(new int[]{}));
        System.out.println(function(new int[]{10}));
    }
    static int function(int[] a){

        if(a==null||a.length % 2 == 0){
            return 0;
        }
        if(a.length==1){
            return 1;
        }
        int midIdx = a.length/2;
        int midItem = a[midIdx];
        for (int i=0;i<a.length;i++) {
            if (i!=midIdx&&midItem >= a[i]) {
                return 0;
            }
        }
     return 1;
    }
}