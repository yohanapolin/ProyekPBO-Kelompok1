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
    
    public void MenyusunBuah(){
        Buah _buah = new Buah ();
        _buah.kadaluarsa();
        
        RakBuah rak = new RakBuah ();
        rak.getRak_id();
        
        //to be continued
    }

}
