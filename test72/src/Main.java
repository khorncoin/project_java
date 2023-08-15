public class Main {
    public static void main(String[] args) {
        System.out.println(isZeroBalanced(new int[]{0, 0, 0, 0, 0, 0} ));
    }


    public static int isZeroBalanced(int [ ]a){

        int len = a.length;

        if(len<2) return 0;
        int sum = 0;
        int sumZero = 0 ;

        for(int i = 0;i<len;i++){
            for(int j = 0;j<len;j++){
                if(i!=j){
                    if(a[i]+a[j]==0) sumZero++;
                }
            }
            if(sumZero==0) return 0;
            sumZero =0;
             sum += a[i];
        }
        if(sum!=0) return 0;

        return 1;
    }

//    static int isZeroBalanced(int[] a) {
//        int sum = 0;
//
//        int len = a.length;
//        if (len == 0) return 0;
//        for (int i = 0; i < len; i++) {
//            boolean found = false;
//            for (int j = 0; j < len; j++) {
//                if (-a[i] == a[j]) {
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) return 0;
//            sum += a[i];
//        }
//        if (sum == 0) {
//            return 1;
//        }
//        return 0;
//    }



}