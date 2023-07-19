// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isMercurial(new int[] {5, 2, 10, 3, 15, 1, 2, 2} ));


    }
    public static int isMercurial(int[] a)
    {
        int isMercurial = 1;

        int firstone = -1, secondone = -1, firstthree = -1;

        for (int i = 0; i < a.length && isMercurial == 1; i++)
        {
            int current = a[i];
            if (current == 1)
            {
                if (firstthree == -1)
                {
                    firstone = i;
                }
                else
                {
                    if (firstthree != -1)
                    {
                        secondone = i;
                        if (firstthree != -1 && firstone != -1 && secondone != -1)
                        {
                            if (firstone < firstthree && firstthree < secondone)
                            {
                                isMercurial = 0;
                            }
                        }
                    }
                }
            }
            else if (current == 3)
                if (firstone != -1)
                    firstthree = i;
        }

        if (firstthree != -1 && firstone != -1 && secondone != -1)
        {
            if (firstone < firstthree && firstthree < secondone)
            {
                isMercurial = 0;
            }
        }

        return isMercurial;
    }
}