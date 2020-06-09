import java.util.Date;

@author naomi

public class Laporan {
  private String noLaporan;
  private String jenisLaporan;
  private Date tanggalLaporan;
  
  public Laporan (String noLaporan, String jenisLaporan, Date tanggalLaporan) {
  this.noLaporan = noLaporan;
  this.jenisLaporan = jenisLaporan;
  this.tanggalLaporan= tanggalLaporan;
  }
  
  public String getNomor() {
  return noLaporan;
  }
 }
  
        
