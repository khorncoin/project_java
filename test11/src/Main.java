// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{9,10,0}));
    }

    static int isMeera(int[] items) {

        if(items.length<2) return  0;
        for(int i=0;i< items.length;i++){
            if(items[i]==1){
                for(int j=0;j<items.length;j++){
                    if(items[j]==9){
                        return 1;
                    }
                }
            }
            else if (items[i]==9) {
                for(int j=0;j<items.length;j++){
                    if(items[j]==1){
                     return 1;
                    }
            }
        }
    }
        return 0;
    }
}