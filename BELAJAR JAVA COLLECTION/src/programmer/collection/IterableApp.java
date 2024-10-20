package programmer.collection;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        Iterable<String> names = List.of("Hamdani", "Aulia", "Sangkal");
        for(var name: names){
            System.out.println(name);
        }

        //IMPLEMENTASINYA
        System.out.println("ITERATOR");
        Iterator<String> iterator = names.iterator();

        //dulu sebelum ada for-each, jadi harus menggunakan while

        while (iterator.hasNext()){
            String name = iterator.next(); //ambil elemennya
            System.out.println(name);
        }

    }
}
