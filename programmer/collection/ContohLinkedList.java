package programmer.collection;

import java.util.LinkedList;

public class ContohLinkedList {
    public static void main(String[] args) {

        LinkedList<String> buah = new LinkedList<>();

        // menambahkan elemen ke LinkedList
        buah.add("Apel");
        buah.add("Pisang");

        System.out.println("Isi LinkedList:" + buah);

        buah.addFirst("Mangga");
        System.out.println("Setelah menambahkan mangga diawal: " + buah);

        buah.addLast("Jambu");
        System.out.println("Setelah menambahkan jambu diakhir: " + buah);

        //menghapus element
        buah.remove("Pisang");
        System.out.println("Setelah menghapus pisang: " + buah);

        // mengambil element pertama dan terakhir

        String buahPertama = buah.getFirst();
        String buahTerakhir = buah.getLast();
        System.out.println("Buah pertama: " + buahPertama);
        System.out.println("Buah terakhir: " + buahTerakhir);

        //menampilkan ukuran Linked List
        System.out.println("Jumlah element: " + buah.size());

    }
}
