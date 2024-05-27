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
public class TokoBuku {
    public static void main(String[] args) {
        
        System.out.println("latihan");
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
        System.out.println(buku1.penerbit);
        System.out.println(buku1.harga.getBeli());
        
        }
    }

    class Buku{
        String Judul;
        String Author;
        int TahunPenerbitan = 2024;
        Harga harga = new Harga();
        PerusahaanBuku penerbit = new PerusahaanBuku();
        
        public void terjual(){
            System.out.println("Buku terjual dengan harga:"+harga.getBeli());
        }
    }

    class Harga{
        private double jual = 100000;
        private double beli = 80000;  

    public double getJual() {
        return jual;
    }

    public void setJual(double jual) {
        this.jual = jual;
    }

    public double getBeli() {
        return beli;
    }

    public void setBeli(double beli) {
        this.beli = beli;
    }
        
        
    }