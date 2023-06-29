// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static void main(String[] args) {
//        System.out.println(isMadhavArray(new int[]{2,1,1}));
//    }
//    static int isMadhavArray(int[] a){
//           int first = 0;
////           int[] sam=new int[]{};
//           int sam=0;
//           int index=1;
//           int lengthMad = 2;
//        if(a.length>2){
//            first = a[0];
//            for(int i=0;i<a.length;i++){
//                for(int j=index;j<=lengthMad;j++){
//                    sam+=a[j];
//                }
//                if(first==sam){
//                    lengthMad++;
//                }
//
//            }
//
//        }
//
//        return 0;
//    }

    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{3,1,2,3,0}));
    }

    static int isMadhavArray(int[] a) {
        int isMadhav = 1;
        int isMadhavLength = 0;

        if (a.length < 3) return 0;

        for (int i = 1; i <= a.length; i++) {
            if (a.length == i*(i+1)/2) {
                isMadhavLength = 1;
            }
        }
        if (isMadhavLength == 0) return 0;

        int startIndex = 1;
        int round = 1;
        int endIndex = startIndex + round;
        int firstValue = a[0];

        while (isMadhav == 1 && endIndex <= a.length) {
            int sum = 0;
            for (int i = startIndex; i <= endIndex; i++) {
                sum += a[i];
            }
            if (firstValue != sum)
                isMadhav = 0;

            round++;
            startIndex = endIndex + 1;
            endIndex = startIndex + round;
        }
        return isMadhav;
    }

}