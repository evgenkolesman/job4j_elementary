package 1try;
import java.io.File;
import java.util.Scanner;
private class Alexexersize
{   //final static n = new Scanner();// надо придумать как вводить любой файл;
    public static void main (String [] args)
    {
            try
            {
            Scanner in = new Scanner(File());
            StringBuilder f = new StringBuilder();
            while (in.hasNext())
                f.append(in.nextLine()).append("\n");
                System.out.println(f.toString());
            } catch ( Exception ex ) {
                ex.printStackTrace();
            }
    }
}
