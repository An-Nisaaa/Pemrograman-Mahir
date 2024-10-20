package programmer.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Hamdani");
        collection.add("Aulia");
        collection.add("Sangkal");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        //melakukan perulangan untuk menampilkan datanya
        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("Sangkal");
        collection.removeAll(List.of("Zaman", "Now"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Aulia")
        );
        System.out.println(
                collection.containsAll(List.of("Hamdani", "Programmer"))
        );

    }
}
