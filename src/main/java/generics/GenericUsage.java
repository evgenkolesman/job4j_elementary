package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericUsage {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("first");
        list.add("second");
        list.add("third");
        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
            System.out.println("Текущий элемент: " + s);
        }
    }
}
