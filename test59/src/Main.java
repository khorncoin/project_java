public class Main {
    public static void main(String[] args) {
        System.out.println(loopSum(new int[]{36, -28}));
    }

    public static int loopSum(int[ ] a){

        int len = a.length;

        if(len<2) return 0;

        int evenIndex = 0;
        int square = 0;

        for(int i=0;i<len;i++){
            if(isSquare(a[i])) square++;
            if(a[i]%2==0) evenIndex++;
        }
        if(square!=0&&evenIndex!=0) {
            for(int i=0;i<len;i++){
                for(int j=1;j<len;j++){
                    if(a[i]+a[j]==8)return 1;
                }
            }
        }

        return 0;
    }

    public static boolean isSquare(int n){
        for(int i=1;i<n;i++){
            if(Math.pow(i,2)==n) return true;
        }
        return false;
    }

}