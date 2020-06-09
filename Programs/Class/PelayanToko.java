public class PelayanToko {
    static private String Nama;
    static private String ID;
    
    public PelayanToko(String _Nama, String _ID){
        Nama = _Nama;
        ID = _ID;
    }
    
    public get_id(){
        return ID;   
    }
    
    public getNama(){
        return Nama;   
    }
    
    public set_id(String _ID){
        ID = _ID;   
    }
    
    public setNama(String _Nama){
        Nama = _Nama
    }
    
    public void  MenyusunBuah(){
        Buah _buah = new Buah ();
        _buah.kadaluarsa();
        
        RakBuah rak = new RakBuah ();
        rak.getRak_id();
        
        //to be continued
    }

}
