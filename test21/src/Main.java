// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[]{1,4,3,2,1,2,3,2} ));
    }

    static int stantonMeasure(int[] items){
        int stantonMeasure = 0;
        int stantonMeasure2 = 0;
        int firstItem = 0 ;
        if(items.length==1) return 1;
        if(items.length>0){
            firstItem = items[0];
            for(int i=0;i<items.length;i++){
                if(items[i]<firstItem){
                    firstItem = items[i];
                }
            }
            for(int i=0;i<items.length;i++){
                if(firstItem==items[i]){
                    stantonMeasure++;
                }
            }
//            System.out.print(stantonMeasure);
            for(int j=0;j<items.length;j++){
                if(stantonMeasure==items[j]){
                    stantonMeasure2++;
                }
            }
        }

        return  stantonMeasure2;
    }

//
//    public static void main(String[] args) {
//        System.out.println(stantonMeasure(new int[]{4,3,2,2,3,3,3,2,1,1}));
//    }
//
//    static int stantonMeasure(int[] a) {
//        int stantonMeasure = 0;
//        int occurrencesOfOne = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 1)
//                occurrencesOfOne++;
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == occurrencesOfOne)
//                stantonMeasure++;
//        }
//
//        return stantonMeasure;
//    }

}