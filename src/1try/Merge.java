
import java.util.Arrays;
/*
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count=0;

        while (count< rsl.length) {
            int i=0;
            if (left [i]<=right [i])
            {
                Arrays.fill(rsl,i,left [i]);
                //rsl[i]=left [i];
                i++;
            }
            else rsl[i]=right [i];
             if (left[]=={}){
                rsl[i]=right [i];
             }
             if
                i++;
            count++;
            }
        return rsl;
        }
        }



/*import java.util.Arrays;


public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count=0;
        for (int i=0; i<left.length;i++){
            rsl[i]=left[i];
            count=count+1;
        }
        for (int j=0; j<right.length;j++){
            rsl[count]=left[j];
            count = count+1;
            Arrays.sort(rsl);
        }

        return rsl;
    }
}

*/