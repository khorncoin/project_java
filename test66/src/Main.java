
public class Main {
    public static void main(String[] args) {
        System.out.println(isLayered(new int[]{3, 3, 3, 3, 3, 3, 3}));
    }
    public static int isLayered(int []a){
        int len = a.length;

        if(len<2) return 0;

        int firstIndex = a[0];
        int minIndex = 0;
        int maxIndex = 0;
        if(checkNumber(a,firstIndex)) return 1;
        for(int i =0 ; i<len;i++){
            minIndex = Math.min(firstIndex,a[i]);
            maxIndex = Math.max(firstIndex,a[i]);
        }
        if(firstIndex!= minIndex) return 0;

        int Layered =0;


        for(int i = minIndex;i<=maxIndex;i++){

            for(int j =0;j<len;j++){
                if(a[j]==i) Layered++;
            }
            if(Layered<2) return 0;
            Layered =0;
        }

        return 1;
    }

    public static Boolean checkNumber(int []array,int n){
        int [] newArray = new int[array.length];
        for(int i =0;i<array.length;i++){
            newArray[i] = n;
        }
        for(int j =0;j<newArray.length;j++){
            if(array[j]!=newArray[j]) return false;
        }


        return true;
    }


}