public class Main {
    public static void main(String[] args) {
        System.out.println(sameNumberOfFactors(23,97));
    }

    public static int sameNumberOfFactors(int n1,int n2){

        if(n1==n2) return 1;
        if(n1<0||n2<0) return -1;
        if(n1==0||n2==0) return 0;

        int factorsN1 =0;
        int factorsN2 = 0;
//        System.out.println((Math.max(n1, n2)));
        for(int i = 1; i<=(Math.max(n1, n2)); i++){

            if(n1%i==0) factorsN1++;
            if(n2%i==0) factorsN2++;
        }

//        System.out.println(factorsN1);
//        System.out.println(factorsN2);
        if(factorsN1!=factorsN2) return 0;

        return 1;
    }

}