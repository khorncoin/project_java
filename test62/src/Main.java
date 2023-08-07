public class Main {
    public static void main(String[] args) {

        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3},2));

    }

    public static int hasNValues(int[] a,int n){

        int len = a.length;


        if(len==0||len<n) return 0;

        int numberAll = 1;
        int checkN = 0;


        for(int i=0;i<len;i++) {
            if(a[0]!=a[i]) numberAll++;
            if(a[i]==n) checkN++;
        }
        if(numberAll<n||checkN==0) return 0;

        return 1;
    }

}