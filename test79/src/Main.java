public class Main {
    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[]{1, 4, 3, 2, 1, 2, 3, 2}));
        System.out.println(stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4} ));
        System.out.println(stantonMeasure(new int[]{3, 1, 1, 4}));
        System.out.println(stantonMeasure(new int[]{0} ));
    }

    public static int stantonMeasure(int[] a)
    {
        int oneCount = 0,occurCount = 0;
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] == 1)
            {
                oneCount++;
            }
        }
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == oneCount) occurCount++;
        }

        return occurCount;

    }


//    public static int stantonMeasure(int []a){
//
//        int len = a.length;
//        int isStantonMeasure = 0;
//        int minIndex = 0;
//        int find = 0;
//
//        if(len>0){
//            if(len==1) return 1;
//            minIndex = findMinIndex(a);
//
////            System.out.println(minIndex);
//
//            for(int i = 0 ; i<len ; i++){
//                if(a[i]==minIndex) find++;
//            }
//
//        }
//
//       return isStantonMeasure;
//    }

//    public static int findMinIndex(int[] a){
//
//        int min = a[0];
//
//        for(int i=0;i<a.length;i++){
//            min = Math.min(min,a[i]);
//        }
//        return min;
//    }


}