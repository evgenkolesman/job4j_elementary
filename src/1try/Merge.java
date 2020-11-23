
import java.util.Arrays.*;
public static int[] Merge(int[] left, int[] right)
{
        int[] rsl = new int[left.length + right.length];
        int count=0;
        for (int i=0; i<left.length;i++)
        {
            rsl[i]=left[i];
            count=count+1;
        }
        for (int j=0; j<right.length;j++)
        {
            rsl[count+1]=left[j];
        }

        Arrays.sort(rsl, 0, rsl.length);
        return rsl;
}

