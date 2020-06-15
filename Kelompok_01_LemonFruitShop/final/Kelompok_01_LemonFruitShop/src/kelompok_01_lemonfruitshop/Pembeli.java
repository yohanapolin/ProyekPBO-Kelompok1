
package kelompok_01_lemonfruitshop;

import java.util.Date;

public class Pembeli {
    
    public void membelibuah(int harga, int jumlahBuah, int Kembalian, int Total, int pembelian){
         
       Transaksi transaksi = null;
       harga =transaksi.getHargaBuah();
       jumlahBuah =transaksi.getJumlahBuah();
       Kembalian = transaksi.getKembalian();
       Total = transaksi.getTotal();
      pembelian = transaksi.getPembayaran();
               
       
    }
    
   public void checkinfobuah(String id, String name, Date Kadaluarsa,int harga){
       Buah buah = null;
       id = buah.getID_buah() ;
       name =buah.getName();
      Kadaluarsa = buah.getkadaluarsa();
       harga = buah.getHarga();
       
       
   }
    
}

