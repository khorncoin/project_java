import java.util.Arrays;

public class Main {
//    public static void main(String[] args) {
//        System.out.printf("\tHello and welcome!\n");
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
//    }
    //test1
//    public static void main(String[] args) {
//        System.out.println(isCentered(new int[]{3,2,1,4,5}));
//    }
//    static int isCentered(int[] items) {
//        if (items.length == 0 || items.length % 2 == 0)
//            return 0;
//        int midIndex = items.length / 2;
//        System.out.println(midIndex);
//        int middleItem = items[midIndex];
//        System.out.println(middleItem);
//        for (int i = 0; i < items.length; i++) {
//            if (i != midIndex && middleItem >= items[i])
////                System.out.println(i);
//                return 0;
//        }
//        return 1;
//    }

    //test2

//    public static void main(String[] args) {
//        System.out.println(sumEvenOdd(new int[]{1,2,3}));
//    }
//
//    static int sumEvenOdd(int[] items) {
//        int sumEven = 0;
//        int sumOdd = 0;
//
//        for (int i = 0; i < items.length; i++) {
//            if (items[i] % 2 == 0)
//                sumEven += items[i];
//            else
//                sumOdd += items[i];
//        }
//        return sumOdd - sumEven;
//    }


    //test3

//    public static void main(String[] args) {
//        System.out.println(charArrayBasedStartLength(new char[]{'a','b', 'c'}, 0, 4));
//    }
//
//    static String charArrayBasedStartLength(char[] chars, int start, int len) {
//        if (len < 0 ||start < 0 || start + len - 1 >= chars.length)
//            return null;
//        char[] newChars = new char[len];
//        for(int i = start, j = 0; j < len; i++, j++){
//            newChars[j] = chars[i];
//        }
//        return Arrays.toString(newChars);
//    }



    //test4


//    public static void main (String[] args) {
//        System.out.println(reverseIntWithNumericOps(23));
//    }
//
//    static int reverseIntWithNumericOps(int number) {
//        int sign = 1;
//        if (number == 0) return 0;
//        if (number < 0) {
//            sign = -1;
//            number = -number;
//        }
//        int reverse = 0;
//        while (number != 0) {
//            reverse = (reverse * 10) + (number % 10);
//            number /= 10;
//        }
//        return sign * reverse;
//    }



    //test5


//    public static void main(String[] args) {
//        System.out.println(commonElements(new int[]{1,8,3,2}, new int[]{4,2,6,1}));
//    }
//
//    static String commonElements(int[] firstArray, int[] secondArray) {
//        if (firstArray == null || secondArray == null)
//            return null;
//        if (firstArray.length == 0 || secondArray.length == 0)
//            return Arrays.toString(new int[0]);
//        int min = (firstArray.length < secondArray.length) ? firstArray.length : secondArray.length;
//        int[] firstClone, secondClone;
//        if (min == firstArray.length) {
//            firstClone = firstArray;
//            secondClone = secondArray;
//        } else {
//            firstClone = secondArray;
//            secondClone = firstArray;
//        }
//        int[] retArray = new int[min];
//        int count = 0;
//        for (int i = 0; i < firstClone.length; i++){
//            for (int j = 0; j < secondClone.length; j++) {
//                if (firstClone[i] == secondClone[j]) {
//                    retArray[count] = firstClone[i];
//                    count++;
//                }
//            }
//        }
//        int[] commonElements = new int[count];
//        for (int i = 0; i < commonElements.length; i++) {
//            commonElements[i] = retArray[i];
//        }
//
//        return Arrays.toString(commonElements);
//    }



    //test6

    public static void main(String[] args) {
        System.out.println(poe(new int[]{1,8,3,7,10,2}));
    }

    static int poe(int[] numbers) {
        if (numbers.length < 3) return -1;
        int i = 0;
        int j = numbers.length - 1;
        int idx = 1;
        int leftSum = numbers[i];
        int rightSum = numbers[j];
        for (int k = 1; k < numbers.length - 2; k++ ){
            if (leftSum < rightSum) {
                i++;
                leftSum += numbers[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += numbers[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum)
            return idx;
        else
            return -1;
    }

}