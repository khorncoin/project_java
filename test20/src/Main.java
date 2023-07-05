// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[]{8,4,2} ));
    }

    static int isGuthrieSequence(int[] items){
        int lastItem = 0;
        int firstItem = 0;
        int isGuthrieSequence =0;
        if(items.length>2){
            firstItem=items[0];
            lastItem=items[items.length-1];
            if( firstItem>0 & firstItem%2==0 & lastItem==1||lastItem==3  ){
               for(int i=0;i<items.length;i++){
                   for(int j=1;j<items.length;j++){
                       if (items[i] / 2 == items[j]) {
                           isGuthrieSequence=1;
                       }
                       else {
                           isGuthrieSequence = 0;
                       }
                   }
               }
            }
        }
        return isGuthrieSequence;
    }

}