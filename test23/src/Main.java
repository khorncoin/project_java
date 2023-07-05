
public class Main {
    public static void main(String[] args) {
        System.out.println(isEvenSpaced(new int[]{200,10,151,160} ));
    }

  static int isEvenSpaced(int[] items){
        int isEvenSpaced=0;
        int maxItem=0;
        int minItem=0;

        if(items.length<1)return 0;
        minItem=items[0];
        maxItem=items[0];
        for(int i=0;i<items.length;i++){
            if(maxItem<items[i]){
                maxItem=items[i];
            }
            else if (minItem>items[i]) {
                minItem=items[i];
            }
        }
      if((maxItem-minItem) % 2 == 0) isEvenSpaced =  1 ;



        return  isEvenSpaced ;
  }

}