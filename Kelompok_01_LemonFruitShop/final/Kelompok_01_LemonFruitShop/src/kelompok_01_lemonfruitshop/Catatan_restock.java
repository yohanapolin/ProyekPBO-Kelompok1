
package kelompok_01_lemonfruitshop;

import java.util.Date;

public class Catatan_restock {
  private String id_transaksi;
  private Date tanggal;
  private String jenis_buah;
  private int jumlah;
  private String supplier;
  private int harga;

    Catatan_restock(String id, Date tanggal, String jenis, int jumlah, String Supplier, int harga) {
        this.id_transaksi = id;
        this.tanggal = tanggal;
        this.jenis_buah = jenis;
        this.jumlah = jumlah;
        this.supplier = Supplier;
        this.harga = harga;
      
    }
 public String getid(){
     return id_transaksi;
 }   
 
 public Date gettanggal(){
     return tanggal;
 }
 
 public String getjenis(){
     return jenis_buah;
 }
 
 public int getjumlah(){
     return jumlah;
 }
 
 public String getsup(){
    return supplier;
}
 
public int getharga(){
    return harga;
}

public void setid(String id_transaksi){
     this.id_transaksi = id_transaksi;
 }   
 
 public void settanggal(Date tanggal){
     this.tanggal = tanggal;
 }
 
 public void setjenis(String jenis_buah){
     this.jenis_buah = jenis_buah;
 }
 
 public void setjumlah(int jumlah){
     this.jumlah = jumlah;
 }
 
 public void setsup(String supplier){
    this.supplier = supplier;
}
 
public void setharga(int harga){
    this.harga = harga;
}
}