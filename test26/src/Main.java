public class Main {
    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1} ));
    }
    static int largestAdjacentSum(int[] items){
        int largestAdjacentSum = 0;

        if(items.length<1) return 0;
        largestAdjacentSum = items[0]+items[1];
        for(int i=0;i<items.length;i++){
            for(int j=1;j<i;j++){

               if( largestAdjacentSum<items[i]+items[j]){

                   largestAdjacentSum=items[i]+items[j];

               }

            }


        }

        return largestAdjacentSum;
    }


}