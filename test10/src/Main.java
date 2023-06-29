// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isFancy(61));
    }

    static int isFancy(int number) {
        int isFancyNumber = 0;
        int previous = 1;
        int pPrevious = 1;
        int currentNumber = 0;

        if (number == 1) return 1;
        if (number <= 0) return 0;

        for (int i = 0; i < number/2; i++){
            currentNumber = 3*previous + 2*pPrevious;
            if (currentNumber == number) {
                isFancyNumber = 1;
                break;
            } else {
                isFancyNumber = 0;
                pPrevious = previous;
                previous = currentNumber;
            }
        }
        return isFancyNumber;
    }
}