package enums;
import java.util.*;

public class EnumTest
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner((System.in));
        System.out.print
                ("Введите размер: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("размер= " + size);
        System.out.print("Аббревиатура = " + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println(" Хорощая работа, ты обратил внимание на ___.");
    }
}

enum Size
{
    SMALL("S"), MEDIUM ("M"), LARGE ("L"), EXTRA_LARGE("XL");
    private Size (String abbreviation)
    {
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation()
    {
        return abbreviation;
    }
    private String abbreviation;
}