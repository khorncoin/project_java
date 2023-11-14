import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(f(new int []{1, 8, 3, 2},new int [] {4, 2, 6, 1}));
        System.out.println(f(new int []{1, 8, 3, 2, 6},new int [] {2, 6, 1}));
        System.out.println(f(new int []{1, 3, 7, 9},new int [] {7, 1, 9, 3}));
        System.out.println(f(new int []{1, 2},new int [] {3, 4}));
        System.out.println(f(new int []{},new int []  {1, 2, 3}));
        System.out.println(f(new int []{1, 2},new int []{}));
        System.out.println(f(new int []{1, 2},null));
        System.out.println(f(null,new int []{}));
        System.out.println(f(null,null));
    }
    static List<Integer> f(int[] first, int[] second){

        if(first==null||second==null){
           return null;
        }

        List<Integer> resultArray = new ArrayList<>();

        for(int j:first){
          for(int t:second){
              if(j==t){
                  resultArray.add(j);
              }
          }
        }



        return resultArray;
    }
}