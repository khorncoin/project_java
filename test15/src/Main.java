// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(answerThree(new int[]{5,4,3,2,3,4,6,1}));
    }

   static  int answerThree(int[] items){
        int startLength=0;
        int endLength=0;
       int startItem=0;
       int endItem=0;
       if (items.length <= 1 || items.length % 2 == 0) {
           startLength = items.length / 2;
           endLength = items.length / 2;

           for (int i = 0; i < startLength; i++) {
               startItem += items[i];
           }

           for (int j = endLength; j < items.length; j++) {
               endItem += items[j];
           }
           if (startItem == endItem) {
               return 1;
           }
       }
       return 0;

   }

}