public class Try1 {
    @SuppressWarnings("checkstyle:LeftCurly")
    public static void main (String [] args)
    {
        final double CM_PER_INCH = Try_constant_2.CM_PER_INCH;
        double paperWidth = 9;
        double PaperHeight = 12;
        System.out.println ("Размер в сантиметрах: "+paperWidth*CM_PER_INCH+" на "+PaperHeight*CM_PER_INCH);
    }
}
