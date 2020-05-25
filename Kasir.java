import java.util.Date;

/**
 *
 * @author dennitogg
 */
public class Kasir {
    
    private int kodePembayaran;
    private int totalPembayaran;
    private String jenisPembayaran;
    private Date tanggalPembayaran;
    
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
    
    
}
