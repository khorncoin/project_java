import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{1}  ));
        System.out.println(isInertial(new int[]{2} ));
        System.out.println(isInertial(new int[]{1, 2, 3, 4} ));
        System.out.println(isInertial(new int[]{1, 1, 1, 1, 1, 1, 2} ));
        System.out.println(isInertial(new int[]{2, 12, 4, 6, 8, 11} ));
        System.out.println(isInertial(new int[]{2, 12, 12, 4, 6, 8, 11} ));
        System.out.println(isInertial(new int[]{-2, -4, -6, -8, -11}  ));
        System.out.println(isInertial(new int[]{2, 3, 5, 7}  ));
        System.out.println(isInertial(new int[]{2, 4, 6, 8, 10}  ));
    }
    public static int isInertial(int []a){

        int len = a.length;

        if (len>1) {

            int oddNumberMax = 0;
            int evenNumberMax = 0;
            int oddIndex = 0;
            int evenIndex = 0;
            List<Integer> listEven = new ArrayList<>();
            List<Integer> listOdd = new ArrayList<>();

            for(int i = 0 ; i<len ;i++){
                if(a[i]%2==0){
                    evenIndex++;
                    if(a[i]>=evenNumberMax)  evenNumberMax =a[i];
                    listEven.add(a[i]);
                }else {
                    oddIndex++;
                    if(a[i]>=oddNumberMax)  oddNumberMax =a[i];
                    listOdd.add(a[i]);
                }
            }
            if(oddNumberMax > evenNumberMax || evenIndex ==0 || oddIndex==0) return 0;

           if(listEven.size()>listOdd.size()){
               for(int i =0;i<listEven.size();i++){
                   if(listEven.get(i)!=evenNumberMax){
                      for(int j=0;j<listOdd.size();j++){
                          if(listEven.get(i)>=listOdd.get(j)) return 0;
                      }
                   }
               }
           }
           else {
               for(int i =0;i<listOdd.size();i++){
                       for(int j=0;j<listEven.size();j++){
                           if(listEven.get(j)!=evenNumberMax){
                             if(listEven.get(j)>=listOdd.get(i)) return 0;
                       }
                   }
               }
           }

          return 1;
        }
        return 0;
    }
}