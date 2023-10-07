import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(repsEqual(new int []{3, 2, 0, 5, 3},32053));
        System.out.println(repsEqual(new int []{3, 2, 0, 5},32053));
        System.out.println(repsEqual(new int []{3, 2, 0, 5, 3, 4},32053));
        System.out.println(repsEqual(new int []{2, 3, 0, 5, 3} ,32053));
        System.out.println(repsEqual(new int []{9, 3, 1, 1, 2} ,32053));
        System.out.println(repsEqual(new int []{0, 3, 2, 0, 5, 3}  ,32053));
    }
    public static int repsEqual(int[] a,int n){


        List<Integer> list = new ArrayList<>();


            if(a[0]==0){
                for(int i = 1 ; i < a.length ; i++ ) {
                    list.add(a[i]);
                }

            }else {
                for(int i = 0 ; i < a.length ; i++ ) {
                    list.add(a[i]);
                }
            }



        int len = list.size();

//            System.out.println(len);

        int lenNumber = String.valueOf(n).length();

        if( len>0 && len==lenNumber) {

            List<Integer> listNew = getArrayInteger(n);

           for(int i = 0 ; i < len ; i++ ){

               if(list.get(i)!=listNew.get(i)) return 0 ;

           }
            return 1 ;
        }
        return 0 ;
    }


    public static List<Integer> getArrayInteger (int n){
        String numString = String.valueOf(n);
        List<Integer> list = new ArrayList<>();
        for (char digitChar : numString.toCharArray()) {
            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                list.add(digit);
            }
        }

        return  list;

    }


}