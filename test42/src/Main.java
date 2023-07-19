import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[] {2, 2, 2, 2 } ));
    }

    public static int largestDifferenceOfEvens(int[] a){

        int isLargestDifferenceOfEvens = -1 ;
        int lengthEven = 0;

       for(int i = 0; i<a.length; i++){
           if(a[i]%2==0){
               lengthEven++;
           }
       }
       if(lengthEven>1){
           int[] evenArray = new int[lengthEven];
           int j=0;
           for(int i = 0; i<a.length; i++){
               if(a[i]%2==0){
//                   System.out.println(a[i]);
//                   for(int j =0; j<evenArray.length;j++){
//                       evenArray[j]=a[i];
//                   }
                   evenArray[j++]=a[i];
//                   evenArray.
               }
           }
           int numEven = 0;
           int endIndex = evenArray.length-1;
           for(int i = 0; i<evenArray.length; i++){
//               System.out.println(evenArray[i]);
              if(i<endIndex){
                  numEven = evenArray[endIndex]-evenArray[i];
              }
               if(numEven>isLargestDifferenceOfEvens) isLargestDifferenceOfEvens=numEven;
               endIndex -- ;
           }
       }
        return  isLargestDifferenceOfEvens;
    }

}