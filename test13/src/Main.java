
public class Main {
    public static void main(String[] args) {
        System.out.println(answerOne(20));
    }

    static String answerOne(int items) {

        for (int i=0;i<=items;i++) {
             for (int j=0;j<=items;j++){
                 if (items == i * i + j * j)
                     return items + " = " + i + "^2 + " + j + "^2";
             }

        }
        return items + " cannot be expressed as a sum of two squares";
    }
}