public class Laporan  {
    public Integer nomor_laporan;
    public String jenis_laporan;
    public String tanggal_laporan;
    public String isi;
    

   public void set_nomor (Integer nomor) {
       nomor_laporan = nomor;
   }
   
   public void set_jenis (String jenis) {
        jenis_laporan = jenis;
   }
   
   public void set_tgl (String tanggal) {
        tanggal_laporan = tanggal;
   }
   
   public void set_isi (String isi_) {
       isi = isi_;
   }
   
   public Integer get_nomor (Integer nomor) {
        return nomor;
   }
   
   public String get_jenis (String jenis) {
       return jenis;
   }
   
   public String get_tanggal (String tanggal) {
       return tanggal;
   }
   
   public String get_isi (String isi) {
       return isi;
   }
       
       
   }
