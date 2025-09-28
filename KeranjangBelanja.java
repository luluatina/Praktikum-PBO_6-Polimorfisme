/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_tugas;

/**
 *
 * @author user
 */
import java.util.ArrayList;

class KeranjangBelanja {
    private ArrayList<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }

    public void tampilkanDetail() {
        double totalSebelum = 0;
        double totalSesudah = 0;

        System.out.println("===== Detail Pembelian Produk =====");

        for (Produk p : daftarProduk) {
            double harga = p.getHarga();
            double diskon = p.hitungDiskon();
            double hargaDiskon = harga - diskon;

            totalSebelum += harga;
            totalSesudah += hargaDiskon;

            System.out.println("Nama Produk : " + p.getNama());
            System.out.println("Harga       : Rp" + harga);
            System.out.println("Diskon      : Rp" + diskon);
            System.out.println("Harga Diskon: Rp" + hargaDiskon);
            System.out.println("------------------------------------------------");
        }

        System.out.println("--------------- Total Harga ----------------");
        System.out.println("Sebelum Diskon : Rp" + totalSebelum);
        System.out.println("Sesudah Diskon : Rp" + totalSesudah);
    }
}
