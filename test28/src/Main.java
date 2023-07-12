
public class Main {
    public static void main(String[] args) {
        System.out.println(isSequencedArray(new int[] {1, 3, 4, 2, 5} ,1,5) );
    }

//    static int isSequencedArray(int[] items,int n,int m){
//
//        int isSequencedArray=1;
//
//        int[] x = new int[m];
//        int sum=0;
//
//        for(int i=0;i<m;i++){
//            for(int j=n;j<=i+1;j++){
//                sum=j;
//            }
//            x[i]=sum;
//            System.out.println(x[i]);
//        }
////        int[] y = new int[x.length];
//////        y[0]=items[0];
////        for(int i=0;i<items.length;i++){
////            for(int j=0;j<i;j++){
////                if(y[j]!=items[i]){
////                    y[j]=items[i];
////                }
////
////            }
////        }
////                for(int i=0;i<y.length;i++){
////                    System.out.println(y[i]);
////
////        }
//
//
//        for(int i=0;i<items.length;i++){
//            for(int j=0;j<x.length;j++) {
//                if (items[i] != x[j]) {
//                    isSequencedArray = 0;
//                }
//            }
//
//        }
//
//        return isSequencedArray;
//    }

    public static int isSequencedArray(int[] a, int m, int n)
    {
        int isSequnced = 1;
        int current = 0;
        for (int i = 0; i < a.length && isSequnced==1; i++)
        {
            current = a[i];
            if (i == 0) if (current != m) isSequnced = 0;
            if (i == a.length - 1) if (current != n) isSequnced = 0;
            if (current < m || current > n) isSequnced = 0;
            if (i > 0)
                if (current <a[i - 1]) isSequnced = 0;
            if (i < (a.length - 1))
                if (current != a[i + 1])
                    if (a[i + 1] != current + 1) isSequnced = 0;
        }

        return isSequnced;
    }


}