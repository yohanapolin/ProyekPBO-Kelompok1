public class RakBuah {
    static private String rak_id;
    static private int kapasitas;
    static private String jenisBuah;
            
    public RakBuah (String _id, int _Kapasitas, String Jenis){
        rak_id = _id;
        kapasitas = _Kapasitas;
        JenisBuah = Jenis;
    }
   
    public String getID(){
        return rak_id;
    }
    
    public int getKapasitas(){
        return kapasitas;
    }
    
    public int getJenisBuah(){
         return JenisBuah;
    }
    
    public setKapasitas(int _Kapasitas){
        kapasitas = _Kapasitas;
    }
    
    public setJenisBuah(String Jenis){
        JenisBuah = Jenis;
    }
    
    public setID(String _id){
        rak_id = _id;
}
