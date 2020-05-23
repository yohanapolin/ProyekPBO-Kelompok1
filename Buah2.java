

import java.util.Scanner;
public class Buah2 {
    private String NamaBuah;
    private String iNamaBuah;
    private int iStok;
    private int Harga;
    private int Stok;
        
    Scanner input = new Scanner(System.in);
        
  
	
    
    public Buah2(String NamaBuah, int Harga, int Stok){
	this.NamaBuah = NamaBuah;
        this.Harga = Harga;
        this.Stok = Stok;
        
    }
    public String getName(){
        
        return NamaBuah;
    }
    
    public Integer getHarga(){
       
        return Harga;
        
    }
    public Integer getStok (){
     
        return Stok;
        
          
    }
  
    
  public void addStok(String iNamaBuah, Integer iStok){
      System.out.print("masukan nama buah");
      iNamaBuah = input.nextLine();
      System.out.print("masukan stok baru");
       iStok = input.nextInt();
     
       Stok = Stok +  iStok;
       System.out.println("buah " +NamaBuah+ "ditambah" + Stok);
       
  }
      
    }




    
    

