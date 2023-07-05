// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static void main(String[] args) {
//        System.out.println(sumFactor(new int[]{9,-3,-3,-1,-1}));
//    }
//    static int sumFactor(int[] items){
//
//        int sumFactor=0;
//        int firstSum =0;
//        if(items.length==1||items.length==2)return 1;
//
//        if(items.length>2){
//            firstSum = items[0]+items[1];
//            System.out.println(firstSum);
//            for(int i=0;i<items.length;i++){
//                for(int j=1;j<=1;j+=2){
//                    if(items[i]+items[j]==firstSum){
//                        sumFactor++;
//                    }
//                }
//            }
//
//        }
//
//
//        return sumFactor;
//    }
public static void main(String[] args) {
    System.out.println(sumFactor(new int[]{9,-3,-3,-1,-1}));
}

    static int sumFactor(int[] a) {
        int sumOfTheArray = 0;
        int sumFactor = 0;

        if (a.length == 0) return 0;

        for (int i = 0; i < a.length; i++) {
            sumOfTheArray += a[i];
        }
System.out.println(sumOfTheArray);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == sumOfTheArray) sumFactor++;
        }

        return sumFactor;
    }


}