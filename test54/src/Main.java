public class Main {
    public static void main(String[] args) {
        System.out.println(isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8} ,6));
    }

    public static int isPairedN(int[] a, int n){
        int len = a.length;

        if(len ==0 || len <n) return  0;

        for(int i=0;i<len-1;i++ ){
            for(int j=1;j<len;j++){
                if(a[i]+a[j]==len){
                    if(i+j == len){
                        return 1;
                    }
                }
            }

        }

        return 0;
    }

}