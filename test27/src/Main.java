
public class Main {
    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(13332,4));
    }

//    static int checkConcatenatedSum(int items,int n){
//
//        int checkConcatenatedSum =1;
//        String index = Integer.toString(items);
//
//        if((index.length()==1))return 1;
//
//        if(index.length()<=n) return  0;
//
//        int sum=0;
//        int x=items;
//
//        while (x>0){
//
//            int r=x%10;
//            int a=r;
//
//            for(int i=0;i<n;i++){
//                a=a*10+r;
//            }
//            sum +=a;
//            x/=10;
//        }
//
//        return sum==items?1:0;
//
//    }

//    static int checkConcatenatedSum(int n, int catlen) {
//        int sum = 0;
//        int x = n;
//        while (x > 0) {
//            int r = x % 10;
//            int a = r;
//            for (int i = 1; i < catlen; i++) {
//                a = a * 10 + r;
//
//            }
//            sum += a;
//            x /= 10;
//        }
//
//        return sum == n ? 1 : 0;
//    }

    static int checkConcatenatedSum(int n,int item){

        String index = Integer.toString(n);

        if((index.length()==1))return 1;

        if(index.length()<=item) return  0;

        int sum = 0;
        int x = n;
        while (x > 0) {
            int r = x % 10;
            int a = r;
            for (int i = 1; i < item; i++) {
                a = a * 10 + r;

            }
            sum += a;
            x /= 10;
        }

        return sum == n ? 1 : 0;
    }

}