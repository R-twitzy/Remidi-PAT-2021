/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KasirTokoSepatu;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Konstruktor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nama="Walyul'ahdi Maulana Ramadhan";
        
        System.out.print("Merk(910/Adidas/Nike/Skechers/Puma/Reebook/Vans/Converse/Fila) = ");
        String merk=input.nextLine();
        System.out.print("Warna(Black/White/gold/Silver/Orange/Green/Yellow/Blue/Red) = ");
        String warna=input.nextLine();
        System.out.print("Jenis(Cowok/Cewek) = ");
        String jenis=input.nextLine();
        System.out.print("Kategori(Olahraga/Lari/Santai/Kantoran) = ");
        String kategori=input.nextLine();
        System.out.print("Size(25-34) = ");
        int size=input.nextInt();
        System.out.print("Jumlah pasang = ");
        int pasang=input.nextInt();
  
        System.out.println("");
        System.out.println("      ====== TOKO SEPATU JAYA BARU ======");
        System.out.println("------------------------------------------------");
        System.out.println("Nama Kasir = "+nama);
        System.out.println("Tanggal = 30 Mei 2021");
        System.out.println("------------------------------------------------");
        Detail sepatu =new Sepatu( merk,kategori,warna,jenis,size,pasang);
        sepatu.info();
        int harga;
        if(null==merk){
            System.out.println("Merk salah");
        } else switch (merk) {
            case "910":
                harga=200000*pasang;
                System.out.println("Harga\t: Rp"+harga);
                break;
            case "Adidas":
                harga=300000*pasang;
                System.out.println("Harga\t: Rp"+harga);
                break;
            case "Nike":
                harga=400000*pasang;
                System.out.println("Harga\t: Rp"+harga);
                break;
            case "Skechers":
                harga=500000*pasang;
                System.out.println("Harga\t: Rp"+harga);
                break;
            case "Puma":
                harga=600000*pasang;
                System.out.println("Harga\t: Rp"+harga);
                break;
            case "Reebook":
                harga=700000*pasang;
                System.out.println("Harga\t: Rp"+harga);
                break;
            case "Vans":
                harga=800000*pasang;
                System.out.println("Harga\t: Rp"+harga);
                break;
            case "Converse":
                harga=850000*pasang;
                System.out.println("Harga\t: Rp"+harga);
                break;
            case "Fila":
                harga=900000*pasang;
                System.out.println("Harga\t: Rp"+harga);
                break;
            default:
                System.out.println("Merk salah");
                break;
        }
        System.out.println("Terimakasih telah berbelanja");
    }
}
