public class Main {
    public static void main(String[] args) {
        System.out.println(isPrimeHappy(25));

    }
    public static int isPrimeHappy(int n){
        int i =0;
        int num =0;
        int isPrime =0;
        int primeNumbers = 0;
        int isPrimeHappy = 0;

        if (n<1) return 0;

        for (i = 1; i <= n; i++) {
            int counter=0; for(num =i; num>=1; num--)
        {
            if(i%num==0)
            {
                counter = counter + 1;
            }
        }
            if (counter ==2)
            {
                isPrime++;
                primeNumbers = primeNumbers + i ;
            }
        }
       if(isPrime>1) {
           if (primeNumbers%n==0){
               isPrimeHappy = 1 ;
           }
       }

        return isPrimeHappy;
    }
}