package kelompok_01_lemonfruitshop;

import java.util.Date;

public class Kasir {
    
    private String id;
    private String nama;
    private String laporan;

    public void setLaporan(String laporan) {
        this.laporan = laporan;
    }

    public String getLaporan() {
        return laporan;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
   
    public void mengelolaLaporan(String id,String num, Date tanggal){
        Laporan laporan = null;
        laporan.SetNomor(id);
        laporan.SetNomor(num);
        laporan.SetTanggal(tanggal);
    }

    
    
}