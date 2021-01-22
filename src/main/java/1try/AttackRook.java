
public class AttackRook {
    public static boolean check(String left, String right) {

        left = "A4";
        right= "B4";

        if (left.charAt(0)==right.charAt(0)||left.charAt(1)==right.charAt(1))
        {
            return true;
        }


        return false;
    }
}

