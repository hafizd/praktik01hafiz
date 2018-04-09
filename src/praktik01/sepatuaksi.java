/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik01;

/**
 *
 * @author user
 */
public class sepatuaksi {
    public static void main(String[] args) {
        sepatu hafiz = new sepatu();
        sepatu nita = new sepatu();
        sepatu adit= new sepatu();
        
        hafiz.merek="converse";
        hafiz.ukuran="40";
        hafiz.warna="hitam";
        hafiz.jenis="sekolah";
        hafiz.bahan="kain";
        
        nita.merek="pierro";
        nita.ukuran="38";
        nita.warna="pink";
        nita.jenis="jalan";
        nita.bahan="kulit";
        
        adit.merek="nike";
        adit.ukuran="42";
        adit.warna="orange";
        adit.jenis="futsal";
        adit.bahan="kulit";
        
        hafiz.cetakInfo();
        nita.cetakInfo();
        adit.cetakInfo();
    }
}
