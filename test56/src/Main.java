public class Main {
    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1,2,1}));

    }

    public static int is121Array(int[] a){

        int len = a.length;
        if(len<3) return 0;

        int firstItem = a[0];
        int endItem = a[len-1];
        int index1  =0;
        int index2 =0;
        int number1First = 0 ;
        int number1End = 0 ;

        if(firstItem!=1||endItem!=1) return 0;

        for (int i =0;i<len;i++){

            if(a[i]!=1 && a[i]!= 2) return 0;
            if(a[i]==1){
                index1++;
            }
            else if(a[i]==2){
                index2++;
            }

            if(a[i]==1&&i<len/2){
               number1First++;
            }

        }

        for(int j = len-1;j>len/2;j--){
            if(a[j]==1){
                number1End ++;
            }
        }
       if(number1First!=number1End) return 0;

       if(index1==0||index2==0 || index1%2!=0) return 0 ;


       return 1;
    }

}