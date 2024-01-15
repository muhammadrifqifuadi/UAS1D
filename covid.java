import java.util.ArrayList;
import java.util.Calendar;

public class covid {
    public static void main(String[] args) {
        // Membuat ArrayList tipe 3 untuk menampung data pasien
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> vaccinationStatus = new ArrayList<>();

        // Mendata 105 pasien
        for (int i = 1; i <= 105; i++) {
            // Menggunakan data dummy, bisa diganti dengan input pengguna
            names.add("Pasien " + i);
            ages.add((int) (Math.random() * 70) + 10); // Umur antara 10 dan 80 tahun
            vaccinationStatus.add("Belum divaksin");
        }

        // Menampilkan data pasien dan perkiraan tahun lahir
        System.out.println("Data Pasien COVID-19 yang Belum Divaksin:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Nama: " + names.get(i) + ", Umur: " + ages.get(i) + " tahun, Status Vaksin: " + vaccinationStatus.get(i));
        }

        // Menghitung dan menampilkan perkiraan tahun lahir
        System.out.println("\nPerkiraan Tahun Lahir:");
        for (int i = 0; i < ages.size(); i++) {
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int birthYear = currentYear - ages.get(i);
            System.out.println(names.get(i) + ": " + birthYear);
        }
    }
}
