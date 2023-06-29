
public class Main {
    public static void main(String[] args) {
        System.out.println(isInertial(new int[] {1,4,20,1,2,8}));
    }
    static int isInertial(int[] a){
        int maximum=0;
        int isInt= 0;
        boolean checkOdd=false;
        boolean checkEven=false;
        int oddLength=0;
        int evenLength=0;

        if(a.length >= 1){

       for( int i=0 ; i<a.length ; i++ ) {

           if (a[i]%2==0) {
               checkEven=true;
               evenLength++;
           }
           else {
               checkOdd=true;
               oddLength++;
           }
           int[] oddArray=new int[oddLength];
           int[] evenArray = new int[evenLength];
           if (a[i]%2==0) {
               evenArray= new int[]{a[i]};
           }
           else {
               oddArray = new int[]{a[i]};
           }
//           System.out.println(oddArray.length);
//           System.out.println(oddLength);
//           System.out.println(evenArray.length);
//           System.out.println(evenLength);

           if(checkOdd && checkEven){
               if (a[i] > maximum) {
                   maximum = a[i];
               }
               for(int h=0;h<oddArray.length;h++){
                   for(int t=0;t<evenArray.length;t++){
                       if(oddArray[h]<evenArray[t]&&evenArray[t]!=maximum){
                           return  isInt = 0;
//                           System.out.println("hello");
//                           break;
                       }
                       return isInt =1;
                   }
               }

           }
       }
//        return maximum;
        }

        return isInt;
    }
}