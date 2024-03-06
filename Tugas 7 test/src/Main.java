import java.util.*;

public class Main {

    public static List<String> inputListNama(Scanner input) {
        System.out.print("Berapa nama yang akan diinput: ");
        int jumlahNama = Integer.parseInt(input.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < jumlahNama; i++) {
            System.out.print("Masukkan Nama ke-" + (i + 1) + ": ");
            names.add(input.nextLine());
        }
        return names;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengumpulkan nama ke dalam List
        List<String> namaList = inputListNama(input);

        // Tampilkan List
        System.out.println("\n=== Daftar Nama Menggunakan List ===");
        for (String nama : namaList) {
            System.out.println(nama);
        }

        // Konversi ke LinkedList dan tampilkan
        System.out.println("\n=== Daftar Nama Menggunakan LinkedList ===");
        List<String> namaLinkedList = new LinkedList<>(namaList);
        for (String nama : namaLinkedList) {
            System.out.println(nama);
        }

        // Konversi ke HashSet dan tampilkan
        System.out.println("\n=== Daftar Nama Menggunakan HashSet ===");
        Set<String> namaHashSet = new HashSet<>(namaList);
        for (String nama : namaHashSet) {
            System.out.println(nama);
        }

        // Konversi ke TreeSet dan tampilkan
        System.out.println("\n=== Daftar Nama Menggunakan TreeSet ===");
        Set<String> namaTreeSet = new TreeSet<>(namaList);
        for (String nama : namaTreeSet) {
            System.out.println(nama);
        }
    }
}
