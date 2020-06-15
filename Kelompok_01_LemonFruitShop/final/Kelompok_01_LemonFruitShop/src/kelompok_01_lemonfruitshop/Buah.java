/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_01_lemonfruitshop;

import java.util.Date;

public class Buah {
    private String id_buah;
    private String NamaBuah;
    private int Harga;
    private int Stok;
    private Date tanggal_kadaluarsa;
   
        
  
	
    
    Buah(String id_buah, String NamaBuah, int Harga, int Stok, Date Tanggal){
        this.id_buah = id_buah;
	this.NamaBuah = NamaBuah;
        this.Harga = Harga;
        this.Stok = Stok;
        this.tanggal_kadaluarsa = Tanggal;
        
    }

   
   
   
    public void setID_buah (String id_buah){
        this.id_buah = id_buah;

    }
    
    public String getID_buah (){
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
   public Date getkadaluarsa(){
   return this.tanggal_kadaluarsa;   
   }
  
    
  public  void addStok(String ID, String New_Stok){
    

       
       }
  }