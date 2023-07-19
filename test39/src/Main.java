public class Main {
    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
    }

    public static int decodeArray(int[ ] a){

        int decodeArray = 0;
        int positive = 1;
        int zeroCount =0;
        int ten =1;

        for(int i=0;i<a.length;i++){

            if(i==0){
                if(a[i]<0) positive=a[i];
            }
            if (a[i]==0) zeroCount++;
            else {

                if(zeroCount>0){
                    decodeArray = decodeArray * ten;
                    decodeArray += zeroCount;
                    zeroCount =0;
                    ten =10;
                }
                else
                {
                    decodeArray = decodeArray * ten;
                    decodeArray += 0;
                    ten = 10;
                }
            }

        }
        decodeArray = decodeArray *positive;

        return decodeArray;
    }

}