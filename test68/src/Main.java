
public class Main {
    public static void main(String[] args) {
        System.out.println(isHollow(new int[]{0,1,2,0,0,0,3,4} ));
    }
    public static int isHollow(int [] a){

        int len = a.length;

        int numberStart = 0;
        int numberEnd = 0;

       if(checkArrayZero(a)){
           if(len==3) return 1;

           for(int i = 0;i<len;i++){
               if(a[i]==0) break;
               numberStart++;
           }
           for(int i = len-1;i>0;i--){
               if(a[i]==0) break;
               numberEnd++;
           }
           if(numberStart==numberEnd) return 1;
       }
        return 0;
    }
    public static boolean checkArrayZero (int[] array){


        int a = array.length;
        int firstIndex = array[0];
        int lastIndex = array[a-1];
        int findZero = 0;
        if(a >= 5&&firstIndex!=0&&lastIndex!=0&&a%2==1){
            for(int i = 0; i<a; i++){
                if(array[i]==0) findZero++;
            }
            if(findZero>=3) return true;
        }
        else {
            if(a==3){
                for(int i = 0; i<a; i++){
                    if(array[i]==0) findZero++;
                }
                if(findZero>=3) return true;
            }
        }


        return false;
    }

}