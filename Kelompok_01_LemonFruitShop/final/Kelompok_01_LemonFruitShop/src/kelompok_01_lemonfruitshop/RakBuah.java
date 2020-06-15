
package kelompok_01_lemonfruitshop;
public class RakBuah {
    private String rak_id;
    private int kapasitas;
    private String jenisBuah;
            
    public RakBuah (String rak_id, int kapasitas, String jenisBuah){
        this.rak_id = rak_id;
        this.kapasitas = kapasitas;
        this.jenisBuah = jenisBuah;
    }

  

    RakBuah(String string) {
     this.rak_id = string;
    }
   
    public String getID(){
        return rak_id;
    }
    
    public int getKapasitas(){
        return kapasitas;
    }
    
    public String getJenisBuah(){
         return jenisBuah;
    }
    
    public void setKapasitas(int kapasitas){
        kapasitas = kapasitas;
    }
    
    public void setJenisBuah(String jenisBuah){
        this.jenisBuah = jenisBuah;
    }
    
    public void setID(String rak_id){
        this.rak_id = rak_id;
    }
}

