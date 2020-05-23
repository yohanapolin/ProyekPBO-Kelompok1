
public class PelayanToko {
    static private String Nama;
    static private String ID;
    
    public PelayanToko(String _Nama, String _ID){
        Nama = _Nama;
        ID = _ID;
    }
    
    public void  MengaturLetakBuah(){
        Buah _buah = new Buah ();
        _buah.kadaluarsa();
        
        RakBuah rak = new RakBuah ();
        rak.getRak_id();
        
        //to be continued
    }

}
