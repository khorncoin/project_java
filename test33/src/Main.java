public class Main {
    public static void main(String[] args) {
        System.out.println( decodeArray(new int[ ] {-1, 5, 8, 17, 15} ) );
    }

//  static int decodeArray(int[] items){
//        int decodeArray =0;
//
//        if(items.length == 0) return 0;
//
//        for(int i=0;i<items.length;i++){
//            for(int j=1;j<=items.length;j++){
//                System.out.print(items[i] - items[j]);
////                break;
//            }
//
//        }
//
//
//        return decodeArray;
//  }

    static int decodeArray(int[] a) {
        int num = 0;
        String numToString = "";
        for (int i = 0; i < a.length - 1; i++) {
            int diff = (a[i] - a[i + 1]);
            num = diff > 0 ? diff : -1 * diff;
            numToString += String.valueOf(num);
        }
        num = a[0] >= 0 ? Integer.parseInt(numToString) : -1 * Integer.parseInt(numToString);


        return num;
    }


}