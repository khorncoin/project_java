public class Main {
    public static void main(String[] args) {
        System.out.println(allValuesTheSame(new int[] {83, 83, 83} ));
    }

    public static int allValuesTheSame(int[] a){

        int len = a.length;

        if(len==0) return 0;
        if(len==1) return 1;

        int item = a[0];

        for(int i=0;i<len;i++){
            if(item != a[i]) return 0;
        }

        return 1;
    }

}