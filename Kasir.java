
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
