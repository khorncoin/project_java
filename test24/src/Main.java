public class Main {
//    public static void main(String[] args) {
//        System.out.println(isSub(new int[]{13,6,3,2}));
//    }
//
//    static int isSub(int[] items){
//        int isSub =0;
//        if(items.length<2) return 0;
//        int firstItems=items[0];
//        int sumItems = 0;
//        for(int i=1;i<items.length;i++){
//            isSub = 1;
//            for(int j=i+1;j<items.length;j++){
//               sumItems+=items[j];
//            }
////            System.out.println(sumItems);
//            if(items[i]<=sumItems+items[i]){
////                firstItems = sumItems+items[i];
////                sumItems=0;
//                isSub=0;
//                return isSub;
//            }
//            sumItems=0;
//        }
//
//        return isSub;
//    }

    public static void main(String[] args) {
        System.out.println(isSub(new int[]{13,5,3,2}));
    }

    static int isSub(int[] a) {
        int isSubArray = 0;
        int sumAfterElements = 0;

        for (int i = 0; i < a.length; i++) {
            isSubArray = 1;
            for (int j = i+1; j < a.length; j++) {
                sumAfterElements += a[j];
            }

            if (a[i] <= sumAfterElements) {
                isSubArray = 0;
                return isSubArray;
            }
            sumAfterElements = 0;
        }

        return isSubArray;
    }

}