
package kelompok_01_lemonfruitshop;
public class PelayanToko {
    static private String Nama;
    static private String ID;
    
    public PelayanToko(String Nama, String ID){
        this.Nama = Nama;
        this.ID = ID;
    }
    
    public String get_id(){
        return ID;   
    }
    
    public String getNama(){
        return Nama;   
    }
    
    public void set_id(String ID){
        this.ID = ID;   
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    Buah buah = new Buah ();
    RakBuah rak = new RakBuah ();
        
    public  void MenyusunBuah(){
        buah.getkadaluarsa();
        rak.getID();
        
    }

}

