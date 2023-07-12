//public class Main {
//    public static void main(String[] args) {
//        System.out.println( isCubePowerful(153));
//
//    }
//
//    static int isCubePowerful(int n){
//
//        int isCubePowerful = 0;
//
//        if(n<0) return 0;
//
//        for(int i=0;i<=n;i++){
//            isCubePowerful = 0;
//
//            for(int j=0;j<=i;j++){
//                isCubePowerful += Math.pow(j,3);
//            }
//
//            if(isCubePowerful == n){
//                return 1;
//            }
//
//        }
//
//      return 0;
//    }
//
//}



import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int number =  87;

//        log.info("Checking if the number {} is cube-powerful or not. Return 1 for 'Yes' and 0 for 'No.", number);
//        log.info("Actual Result: {}", isCubePowerful(number));
//        System.out.println(number);
        System.out.println(isCubePowerful(number));
    }

    static int isCubePowerful(int n) {
        int sum = 0;
        String str = String.valueOf(n);
        if (n <= 0) {
            return 0;
        }
        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            if (str.contains(String.valueOf(i))) {
                newSet.add(i);
            }
        }

        for (Integer num : newSet) {
            int cube = num * num * num;
            sum += cube;
        }

        if (sum == n) {
            return 1;
        }

        return 0;
    }
}