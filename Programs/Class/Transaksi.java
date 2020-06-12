package  lemonshop;
public class Transaksi {
    
    private int hargaBuah;
    private int jumlahBuah;
    private int pembayaran;
    private int kembalian;
    private int total;

    Transaksi (int harga, int jumlahbuah, int pembayaran, int kembalian, int total){
        this.hargaBuah = harga;
        this.jumlahBuah = jumlahbuah;
        this.pembayaran = pembayaran;
        this.kembalian = kembalian;
        this.total = total;
    }
    public int getTotal() {
        return total;
    }

    public int getKembalian() {
        return kembalian;
    }
    public int getHargaBuah(){
        return hargaBuah;
    }
    public int getPembayaran(){
        return total;
    }
    public int getJumlahBuah(){
        return kembalian;
    }
    
    public void setTotak(int total){
        this.total = total;
    }
    public void setKembalian(int kembalian){
        this.kembalian = kembalian;
    }
    

    public void setJumlah(int jumlah) {
        this.jumlahBuah = jumlah;
    }

    public void setHarga(int harga) {
        this.hargaBuah = harga;
    }

    public void setBayar(int bayar) {
        this.pembayaran = bayar;
    }
    
    
}
