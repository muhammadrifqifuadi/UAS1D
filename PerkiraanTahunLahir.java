import java.util.ArrayList;
import java.util.List;

class Pasien {
    String nama;
    int umur;
    boolean statusVaksin;
    public Pasien(String nama, int umur, boolean statusVaksin) {
        this.nama = nama;
        this.umur = umur;
        this.statusVaksin = statusVaksin;
    }

    public int getTahunLahir() {
        int tahunSekarang = 2024; // Ganti dengan tahun sekarang yang benar
        return tahunSekarang - umur;
    }
}

public class PerkiraanTahunLahir {
    public static void main(String[] args) {
        List<Pasien> daftarPasien = new ArrayList<>();

        daftarPasien.add(new Pasien("Andi", 30, true));
        daftarPasien.add(new Pasien("Budi", 25, false));
        daftarPasien.add(new Pasien("Cici", 40, true));

        for (Pasien pasien : daftarPasien) {
            System.out.println("Nama: " + pasien.nama);
            System.out.println("Umur: " + pasien.umur);
            System.out.println("Status Vaksin: " + (pasien.statusVaksin ? "Tervaksinasi" : "Belum Tervaksinasi"));
            System.out.println("Perkiraan Tahun Lahir: " + pasien.getTahunLahir());
            System.out.println();
        }
    }
}