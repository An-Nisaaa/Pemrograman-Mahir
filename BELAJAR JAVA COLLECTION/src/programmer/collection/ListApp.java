package programmer.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        // List<String> stringss = new LinkedList<>();

        strings.add("Hamdani");
        strings.add("Aulia");
        strings.add("Sangkal");

        strings.set(0, "Programmer");

        strings.remove(1);

        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        
        for (var value : strings) {
            System.out.println(value);
        }

    }
}
