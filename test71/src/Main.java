public class Main {
    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1} ));
    }

    public static int largestAdjacentSum(int []a){

        int len = a.length;
        int largestAdjacentSum = 0;

        if(len>=2){

            largestAdjacentSum = a[0]+a[1];

            for(int i=1; i<len-1;i++){
                if(a[i]+a[i+1]>=largestAdjacentSum){
                    largestAdjacentSum = a[i]+a[i+1];
                }


            }
        }
        return largestAdjacentSum;
    }

}