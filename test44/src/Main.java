public class Main {
    public static void main(String[] args) {
        System.out.println(areAnagrams(new char [ ] {'s', 'i', 't'},new char [ ]  {'i', 't', 's'}));
    }


    public static int areAnagrams(char[] a1,char[] a2){

        int isAreAnagrams = 1;
        int check;
        if(a1.length==0&& a2.length==0) return 1;
        if(a1.length!=a2.length) return 0;
        for(int i=0; i<a1.length;i++){
            check =0;
            for(int j =0;j<a2.length;j++){
                if(a1[i]==a2[j]) check ++;
            }
            if(check==0) return 0;
        }

        return  isAreAnagrams;
    }

}