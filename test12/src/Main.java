// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static void main(String[] args) {
//        System.out.println(isBenn(new int[]{4,9,8}));
//    }
//
//    static int isBenn(int[] items){
//
//        if(items.length==0) return 0;
//     for(int i=0;i<items.length;i++){
//
//     }
//     return 0;
//    }


    public static void main(String[] args) {
        System.out.println(isBean(new int[]{2,2,5,11,23}));
    }

    static int isBean(int[] a) {
        int isBean = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == 2*a[j] || a[i] == 2*a[j] + 1 || a[i] == a[j]/2) {
                    isBean = 1;
                    break;
                }
            }
            return isBean;
        }
        return isBean;
    }


}