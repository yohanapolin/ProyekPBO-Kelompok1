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
  
  public String getJenis() {
    return jenisLaporan;
  }
  
  public String getTanggal(){
    return tanggalLaporan;
  }
  
  public void SetNomor(String noLaporan){
    this.noLaporan = no.Laporan;
  }
  
  public void SetJenis(String jenisLaporan){
    this.jenisLaporan = jenisLaporan;
  }
  
  public void SetTanggal(Date tanggalLaporan){
    this.tanggalLaporan = tanggalLaporan;
  } 
 }
 
  
  
        
