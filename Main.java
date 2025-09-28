/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_tugas;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Bumi Manusia", 115000);
        Produk elektronik = new Elektronik("Headset", 200000);
        Produk pakaian = new Pakaian("Blouse", 150000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

      keranjang.tampilkanDetail();
    }
}  

