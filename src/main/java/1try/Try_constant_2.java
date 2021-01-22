public class Try_constant_2 {
    public static final double CM_PER_INCH=2.54;
    public static void main (String [] args)
    {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Размер листка в сантиметрах: " + paperWidth*CM_PER_INCH+" на "+paperHeight*CM_PER_INCH);
    }
}
