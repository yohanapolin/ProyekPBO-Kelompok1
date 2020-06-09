public class PelayanToko {
    static private String Nama;
    static private String ID;
    
    public PelayanToko(String Nama, String ID){
        this.Nama = Nama;
        this.ID = ID;
    }
    
    public get_id(){
        return ID;   
    }
    
    public getNama(){
        return Nama;   
    }
    
    public set_id(String ID){
        this.ID = ID;   
    }
    
    public setNama(String Nama){
        this.Nama = Nama
    }
    
    public void  MenyusunBuah(){
        Buah _buah = new Buah ();
        _buah.kadaluarsa();
        
        RakBuah rak = new RakBuah ();
        rak.getRak_id();
        
        //to be continued
    }

}
