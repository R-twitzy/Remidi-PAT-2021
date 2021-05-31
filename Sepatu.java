/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KasirTokoSepatu;

/**
 *
 * @author LENOVO
 */
class Sepatu extends Detail{
    private String kategori,merk,jenis;
    
    public Sepatu(String merk, String kategori, String warna, String jenis, int size, int pasang){
        super(warna,size,pasang);
        this.kategori=kategori;
        this.merk=merk;
        this.jenis=jenis;
    }
    
    public void info(){
        System.out.println("Sepatu "+kategori+" "+jenis);
        System.out.println("Merk\t: "+merk);
        super.info();
    }
}

