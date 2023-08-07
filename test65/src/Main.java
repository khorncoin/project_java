public class Main {
    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{1, 2, 4, 3}));
    }

//    public static int isAllPossibilities(int []a){
//
//        int len = a.length;
//
//        if(len==0) return 0;
//        if(len==1) return 1;
//        int i =0;
//        int item = a[0];
//        int maxItem = 0 ;
//        int m =0;
//        int[] newArray = new int[len];
//        if(item==0){
//            for(i=0;i<len;i++){
//                newArray[i] = i;
//            }
//        }
//        else {
//            for(i=len-1;i>=0;i--){
//                newArray[i] = i;
//            }
//        }
//
//
//        for(i=0;i<len;i++){
//           System.out.println(newArray[i]);
//        }
//
//        int newItem = newArray[0];
//
//        if(newItem==0){
//            for(i=0;i<len;i++){
//                if(i!=newArray[i]) return 0;
//            }
//
//        }
//        else {
//            for(i=newItem;i<=0;i--){
//                if(i !=newArray[i]) return 0;
//            }
//        }
//
//        return 1 ;
//    }

    static int isAllPossibilities(int[] a) {
        boolean flag = false;
        if (a.length == 0) {
            return 0;
        }
        int[] arr = sortedArray(a);
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {
            if (i == arr[i] && i <= arrLen - 1) {
                flag = true;
                continue;
            }
            flag = false;
            break;
        }
        return flag ? 1 : 0;
    }

    static int[] sortedArray(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

//    static int isAllPossibilitiesAlternative(int[] a) {
//        int len = a.length;
//
//        if (len == 0) {
//            return 0;
//        }
//
//        for (int i = 0; i < len - 1; i++) {
//            boolean found = false;
//            for (int j = 0; j < len; j++) {
//                if (a[j] == i) {
//                    found = true;
//                }
//            }
//            if (!found) {
//                return 0;
//            }
//        }
//        return 1;
//    }
}
