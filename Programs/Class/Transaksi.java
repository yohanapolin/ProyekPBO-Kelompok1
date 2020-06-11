public class Transaksi {
    
    private int hargaBuah;
    private int jumlahBuah;
    private int pembayaran;
    private int kembalian;
    private int total;

    public int getTotal() {
        return total;
    }

    public int getKembalian() {
        return kembalian;
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
