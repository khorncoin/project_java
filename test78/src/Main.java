public class Main {
    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[]{7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 17, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2}));
    }
    public static int isGuthrieSequence(int []a){

        int len = a.length;
        if(len>2&&a[len-1]==1){
            for(int i = 0,j=1 ; i<len&&j<len ; i+=1,j+=1){
                if(a[i]%2!=0){
                    if(((a[i]*3)+1)!=a[j]) return 0;
                }
                else {
                    if((a[i]/2)!=a[j]) return 0;
                }
            }
            return 1;
        }
        return 0;
    }

}