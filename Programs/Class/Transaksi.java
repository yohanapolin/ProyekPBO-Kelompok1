import java.util.Date;
/**
 *
 * @author dennitogg
 */
public class Transaksi {
    
    private int kodePembayaran;
    private int totalPembayaran;
    private int nomorPembayaran;
    private Date tanggalPembayaran;
    
    public String simpanPembayaran(){
        return null;
    }

    public int getKodePembayaran() {
        return kodePembayaran;
    }

    public void setTotalPembayaran(int totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public void setJenisPembayaran(String jenisPembayaran) {
        this.jenisPembayaran = jenisPembayaran;
    }
     
    public String printPembayaran(){
        return null;
    }
    
    public int getNomorPembayaran() {
        return nomorTransaksi;
    }

    public Date getTanggalPembayaran() {
        return tanggalTransaksi;
    }

    
}    
