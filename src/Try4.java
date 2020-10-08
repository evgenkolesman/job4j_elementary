// запись с расшифровкой логических выражений "|| - и"

public class Try4 {
    public static void main (String [] args){
        //(int Ver {
        //  int x
        // int y = 2;
        //  x != 0 && 1 / x > x + y; // не делить на ноль
        //   x<y ?x:
        //   y; // дает меньшее из значений  x и y
        //  System.out.println("X =" + x);)

    String a = "Evgen";
    String b = a.substring (0,3);// выделяет от 0 до ... те буквы которые есть в пред аргументе
    System.out.println(b);
    String belib = a+b;
    belib = belib.substring(0,7);
    System.out.println(belib);
    String all = String.join ("#@",b,belib); // объединяет все строки, через знак
    System.out.println(all);
     if ("Evgen".equals(belib))
         System.out.println(belib);
                 else System.out.println(a); //сравнение строки на значение  "Evgen"
    }
}

