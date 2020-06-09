import java.util.Date;
/**
 *
 * @author dennitogg
 */
public class Transaksi {
    
    private int kodePembayaran;
    private int totalPembayaran;
    private String jenisPembayaran;
    private Date tanggalPembayaran;
    private int nomorTransaksi;
    private Date tanggalTransaksi;
    
    public String simpanPembayaran(){
        return null;
    }

    public Date getTanggalPembayaran() {
        return tanggalPembayaran;
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
    
    public String simpanTransaksi(){
        return null;       
    }
     
    public String printTransaksi(){
        return null;
    }
    
    public void hapusTransaksi(){
         
    }
    
    public int getNomorTransaksi() {
        return nomorTransaksi;
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    
}    
