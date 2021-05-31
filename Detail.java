/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KasirTokoSepatu;
//import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Detail {
    private String merk, warna, jenis, kategori;
    private int size, pasang;
    
    //Scanner input = new Scanner (System.in);
    
    public Detail (String warna, int size, int pasang){
        
        this.warna=warna;
        this.size=size;
        this.pasang=pasang;
    }
    
    public void info(){
        
        System.out.println ("Warna\t: "+ warna);
        System.out.println("Ukuran\t: "+ size);
        System.out.println("Jumlah\t: "+pasang+" Pasang");
    }
}
