public class Try1 {
    @SuppressWarnings("checkstyle:LeftCurly")
    public static void main (String [] args)
    {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double PaperHeight = 11;
        System.out.println ("Размер в сантиметрах: "+paperWidth*CM_PER_INCH+" на "+PaperHeight*CM_PER_INCH);
    }
}
