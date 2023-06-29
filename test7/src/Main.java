
public class Main {
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(0 ));
    }

    static int nextPerfectSquare(int number) {
        int nextPerfectSquare = 0;

        if (number >= 0) {
            double sqrtResult = Math.sqrt(number);
            int baseNumber = (int) sqrtResult;
            int nextNumber = baseNumber + 1;
            nextPerfectSquare = (int) Math.pow(nextNumber, 2);
        }

        return nextPerfectSquare;
    }
}