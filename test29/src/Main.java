//public class Main {
//    public static void main(String[] args) {
//        System.out.println(largestPrimeFactor(6936));
//    }
//
//    public static int largestPrimeFactor(int n)
//    {
//        int largestpf = 0;
//
//        if (n <= 1) return 0;
//        for (int i = 2; i <= n; i++)
//        {
//            if (n % i == 0)
//                    if (i > largestpf)
//                        largestpf = i;
//        }
//
//        return largestpf;
//    }
//
////        public static void main(String[] args) {
//////            Scanner sc= new Scanner(System.in);
////            System.out.println("Enter a number to check if it is truly prime number or not: ");
////            int number= 14;
////            if(isPrime(number)) {
////                System.out.println(number + " is prime number");
////            }
////            else{
////                System.out.println(number + " is a non-prime number");
////            }
////        }
////        static  boolean isPrime(int num)
////        {
////            if(num<=1)
////            {
////                return false;
////            }
////            for(int i=2;i<=num/2;i++)
////            {
////                if((num%i)==0)
////                    return  false;
////            }
////            return true;
////        }
//
//
//}
//

import java.util.Scanner;
class Prime
{
    public static void main(String arg[])
    {
        int i,count;
        System.out.print("Enter n value : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Prime numbers between 1 to "+n+" are ");
        for(int j=2;j<=n;j++)
        {
            count=0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2)
                System.out.print(j+"  ");
        }
    }
}