public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {

        for(int i=0;i<left.length;i++)
        {
            if(left[i]==right[i]){
                System.out.println(left[i]);}
        }

    }
}
