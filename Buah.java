

import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;

public class Buah {
   
    public int Harga;
    public int Stok;
  
    static ArrayList listbuah = new ArrayList();
    Scanner in = new Scanner(System.in);
    
    public void Showmenu() throws IOException {
        System.out.println("Selamat Datang Dimenu Utama");
        System.out.println("1. Tampilkan Semua Buah");
        System.out.println("2. masukan data buah");
        System.out.println("3. masukan data stok baru");
        System.out.println("4. Exit");
        System.out.print("PILIH MENU > ");
        
        int pilihMenu = Integer.valueOf(in.nextLine());
        
        switch(pilihMenu){
            case 1:
                TampilkanDataBuah();
                break;
            case 2:
                InputDataBuah();
                break;
            case 3:
                TambahStok();
                break;
            case 4: 
                System.exit(0);
            default:
                System.out.println(" menu tidak tersedia ");
    }
        
    }
    
    public void TampilkanDataBuah(){
        if(listbuah.isEmpty()){
            System.out.print("belum ada data");
        }else{
            for(int i =0; i< listbuah.size(); i++){
                System.out.println(String.format("%d %s", i, listbuah.get(i)));
                
            }
        }
    }
    public void InputDataBuah() throws IOException {
        
        System.out.print("Nama Buah: ");
        String NamaBuah = in.nextLine();
        System.out.print("Harga: ");
      Harga = in.nextInt();
       System.out.print("Jumlah Stok");
        Stok = in.nextInt();
        listbuah.add( "nama Buah "+ NamaBuah +"harga "+ Harga +"Jumlah Stok " +Stok);
        
    }
    public void TambahStok() throws IOException{
        TampilkanDataBuah();
        System.out.print("Masukan Nama Buah");
        Integer index = Integer.valueOf(in.nextLine());
        System.out.print("masukan data stok baru");
        int stok = in.nextInt();
        Stok = Stok + stok;
        listbuah.set(index, Stok);
                
        
    
}
}
