
package ProyekPBO;


import java.util.Date;
import java.util.Scanner;
public class Buah {
    private String id_buah;
    private String NamaBuah;
    private int Harga;
    private int Stok;
    private Date tanggal_kadaluarsa;
    Scanner input = new Scanner(System.in);
        
  
	
    
    public Buah(String id_buah, String NamaBuah, int Harga, int Stok, Date Tanggal){
        this.id_buah = id_buah;
	this.NamaBuah = NamaBuah;
        this.Harga = Harga;
        this.Stok = Stok;
        this.tanggal_kadaluarsa = Tanggal;
        
    }
    public void setID_buah (String id_buah){
        this.id_buah = id_buah;

    }
    
    public String ID_buah (){
        return id_buah;
    }
    public void  setName(String name){
    this.NamaBuah = name;
    }
    
    
    public String getName(){
        
        return NamaBuah;
    }
    
    public void setHarga( int harga){
    this.Harga = harga;
    }
    
    public Integer getHarga(){
       
        return Harga;
    }
    
    public void setStok( int stok){
    this.Stok = stok;
    }
    
    public Integer getStok (){
     
        return Stok;   
    }
    
    public void setKadaluarsa( Date tanggal){
    this.tanggal_kadaluarsa =tanggal;
        
    }
   public Date gettanggal(){
   return this.tanggal_kadaluarsa;   
   }
  
    
  public  void addStok(){
      String iNamaBuah;
      Integer iStok;
      System.out.print("masukan nama buah");
      iNamaBuah = input.nextLine();
      System.out.print("masukan stok baru");
      iStok = input.nextInt();

       Stok = Stok +  iStok;
       System.out.println("buah " +iNamaBuah+ "Total" + Stok);
       }
  }
      
    




    
    



