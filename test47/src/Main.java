public class Main {
    public static void main(String[] args) {
        System.out.println(isOneBalanced(new int[] {1, 1, 1, 2, 3, -18, 45, 1, 0} ));
    }
    public static int isOneBalanced(int[] a)
    {

        int isOneBalanced = 1;

        int nonOneSequence = 0, oneSequence = 0;
        int firstOneSquenceCount = 0, secondOneSquenceCount = 0, nonOneSquenceCount = 0;

        for (int i = 0; i < a.length && isOneBalanced == 1; i++)
        {
            int current = a[i];
            if (current == 1)
            {
                if (oneSequence == 0 && nonOneSequence == 0)
                {
                    oneSequence++;
                    if (firstOneSquenceCount == 0)
                    {
                        firstOneSquenceCount++;
                    }
                }
                else
                {
                    if (nonOneSequence == 0)
                    {
                        if (oneSequence == 1)
                            firstOneSquenceCount++;
                        if (oneSequence == 2)
                            secondOneSquenceCount++;
                    }
                    else
                    {
                        if (nonOneSequence == 1 && oneSequence == 1)
                            oneSequence++;

                        if (oneSequence == 2 || nonOneSequence == 1)
                        {
                            secondOneSquenceCount++;
                        }

                    }
                }
            }
            else
            {
                if (nonOneSequence == 0)
                {
                    nonOneSequence++;
                    if (nonOneSquenceCount == 0)
                    {
                        nonOneSquenceCount++;
                    }

                }
                else
                {
                    if (oneSequence == 1 || oneSequence == 0)
                    {
                        nonOneSquenceCount++;
                    }
                    if (oneSequence == 2)
                    {
                        isOneBalanced = 0;
                    }
                }
            }
        }

        if (firstOneSquenceCount + secondOneSquenceCount != nonOneSquenceCount)
            isOneBalanced = 0;
        return isOneBalanced;
    }

}