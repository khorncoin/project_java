
public class Main {
    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[]{9, 0, 2, -5, 7} ));
        System.out.println(countSquarePairs(new int[] {11, 5, 4, 20}));
    }
    public static int countSquarePairs(int []a ){
        int isCountSquarePairs = 0 ;
        int len = a.length;
        int x =0,y=0;
        if(len>1){
            for(int i =0 ;i<len;i++){
                    x = a[i];
                for(int j=0;j<len&&x>0;j++){
                    y = a[j];
                    if(x<y&&isPerfectSquare(x+y))isCountSquarePairs++;
                }
            }
        }
        return isCountSquarePairs;
    }
    public static boolean isPerfectSquare(int n){

        for(int i = 1;i<n;i++){
          for(int j=1 ; j<n;j++){
              if(Math.pow(j,i)==n) return true;
          }
        }
       return false;
    }
//    public static boolean isPerfectSquare(int n)
//    {
//        double sqrt = Math.sqrt(n);
//        return (sqrt == Math.floor(sqrt));
//    }

}