/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_flow;
/**
 *
 * @author A-16
 */
public class LaihanClass {
    public static void main(String[] args) {
    Buku buku1 = new Buku();
    Buku buku2 = new Buku();
    buku1.Judul = "Yuru Camp";
    buku2.Judul = "Heya Camp";
    buku1.Author = "Vito";
    buku2.Author = "Vito";
    
    System.out.println(buku1.Judul);
    System.out.println(buku1.Author);
    System.out.println(buku2.Judul);
    System.out.println(buku2.Author);
    System.out.println(Buku.penerbit);
    
    }
}

class Buku{
    String Judul;
    String Author;
    int TahunPenerbitan = 2024;
    Harga harga = new Harga();
    Perusahaan penerbit = new Perusahaan(nama);
}

class Harga{
    double jual = 100000;
    double beli = 80000;        
}