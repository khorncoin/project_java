
public class Main {
    public static void main(String[] args) {
        System.out.println(f(new char[]{'a', 'b', 'c'}, 0, 4));
        System.out.println(f(new char[]{'a', 'b', 'c'}, 0, 3));
        System.out.println(f(new char[]{'a', 'b', 'c'}, 0, 2));
        System.out.println(f(new char[]{'a', 'b', 'c'}, 0, 1));
        System.out.println(f(new char[]{'a', 'b', 'c'}, 1, 3));
        System.out.println(f(new char[]{'a', 'b', 'c'}, 1, 2));
        System.out.println(f(new char[]{'a', 'b', 'c'}, 1, 1));
        System.out.println(f(new char[]{'a', 'b', 'c'}, 2, 2));
        System.out.println(f(new char[]{'a', 'b', 'c'}, 2, 1));
        System.out.println(f(new char[]{'a', 'b', 'c'}, 3, 1));
        System.out.println(f(new char[]{'a', 'b', 'c'}, 1, 0));
        System.out.println(f(new char[]{'a', 'b', 'c'}, -1, 2));
        System.out.println(f(new char[]{'a', 'b', 'c'},  -1, -2));
        System.out.println(f(new char[]{}, 0, 1));
    }

    static  char[] f(char[] a, int start, int len){
        char[] chars= {};

        if(a==null||a.length<=start||a.length<len||start<0||len<0||start+len>a.length){
            chars = "null".toCharArray();
            return chars;
        }
        chars = new char[len];
        int b = 0;
        for(int i=start; i<len+start; i++){
            chars[b] = a[i];
            b++;
        }
        return chars;
    }
}