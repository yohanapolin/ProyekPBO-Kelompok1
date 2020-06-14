
package kelompok_01_lemonfruitshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import kelompok_01_lemonfruitshop.*;
public class DbHandler {
    private Connection connection;
	private boolean connected;
        public int counter;
        
        
	public DbHandler() {

		this.connected = false;
	}

	public boolean connect(String _host, String _dbName, String _username, String _password) {
		String connectionString = "jdbc:mariadb://" + _host + "/" + _dbName;
		try {
			Class.forName("org.mariadb.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(connectionString, _username, _password);
			this.connected = true;
		} catch (Exception _e) {
			System.out.println("Exception: " + _e.getMessage());
			this.connected = false;
		}
		return (this.connected);
	}

	public void disconnect() {
		if (this.connected) {
			try {
				this.connection.close();
			} catch (Exception _e) {
				System.out.println("Exception: " + _e.getMessage());
			}
		}
		this.connected = false;
	}

	public boolean isConnected() {
		return (this.connected);
	}
        
        
        public void Buah(String Id_buah , String NamaBuah, String Harga,String Stok, String Kadaluarsa, String ID_Rak) {
		
		if (this.connected) {
			String query = "INSERT INTO buah( Id_buah, nama_buah, Harga ,Stok, Tanggal_Kadaluarsa, ID_Rak) VALUES("+"'" + Id_buah + "'," + "'" + NamaBuah + "'" 
					+ "," + "" + Harga + ","+"" + Stok + "," + "'" + Kadaluarsa+ "'," + ID_Rak +");";
			try {
                            Statement stmt = this.connection.createStatement();
                            ResultSet resultSet = stmt.executeQuery(query);
                                
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}

        public Buah getinfobuah( String _id) {
                Buah buah = null;
               
                
		if (this.connected) {
			String query = "SELECT id_buah, nama_buah, Stok, Harga, Tanggal_Kadaluarsa FROM buah WHERE Id_buah ='" + _id + "'";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				while (resultSet.next()) {
                                  
                      buah = new Buah(resultSet.getString(1), resultSet.getString(2),resultSet.getInt(3),resultSet.getInt(4),resultSet.getDate(5));
 
                                  	counter++;
                                      
				}
                                        
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return (buah);
	}

        public RakBuah getidrakbuah(String _id){
                RakBuah rakbuah = null;
                if (this.connected) {
			String query = "SELECT rakbuah.ID_Rak  FROM rakbuah INNER JOIN buah ON rakbuah.ID_Rak = buah.Id_rak AND buah.Id_buah =" + _id ;
			try {
                              PreparedStatement stmt = this.connection.prepareStatement(query);
                              
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				while (resultSet.next()) {
                                rakbuah = new RakBuah (resultSet.getString(1));
                                counter++;
                }
                                        
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		
	
                }
                 return (rakbuah);   
}
        public Buah updateStok( String id, String stok){
                Buah buah = null;
                if (this.connected) {
			String query = "UPDATE `db_lemonshop`.`buah` SET `Stok`="+ stok + " WHERE  `Id_buah`= '" + id + "'";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				while (resultSet.next()) {
                                    buah.setID_buah(resultSet.getString(1));
                                    buah.setStok(resultSet.getInt(2));
                                    counter++;
                 }
                                        
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		
	
                }
                return (buah);
            }
            
         public Buah addStok (String id,String plusStok){
             Buah buah = null;
               if (this.connected) {
			String query = "UPDATE `db_lemonshop`.`buah` SET `Stok`=  Stok +"+ plusStok+ " WHERE  `Id_buah`=" + id;
                               
               try {
				
                                Statement stmt = this.connection.createStatement();
                                stmt.executeUpdate(query);
				//ResultSet resultSet = stmt.executeQuery(query);
                                
				//while (resultSet.next()) {
                            //      buah.addStok(resultSet.getString(1), resultSet.getString(2));
                  //                  counter++;
               //  }
                                        
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
               
                     
               }
                  return (buah);
         }
         
         public  Buah infobuahbyPembeli (String _id){
               Buah buah = null;
                
		if (this.connected) {
			String query = "SELECT id_buah, nama_buah, Harga, Tanggal_Kadaluarsa FROM buah WHERE nama_buah ='" + _id + "'";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				while (resultSet.next()) {
					buah.setID_buah(resultSet.getString(1));
                                        buah.setName(resultSet.getString(2));
                                        buah.setHarga(resultSet.getInt(3));
                                        buah.setKadaluarsa(resultSet.getDate(4));
                                            counter++;
                                      	
				}
                                        
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return (buah);
         }
         
         public Buah deletebuah (String id){
             Buah buah = null;
                
		if (this.connected) {
			String query = "DELETE FROM `db_lemonshop`.`buah` WHERE  `Id_buah`=" +"'"+ id+ "';";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				stmt.executeUpdate(query);
                                
				
                                        
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return (buah);
             
         }    
    
   public List<Buah> getallbuah(){
       this.counter = 0;
		List<Buah> buff = new ArrayList<Buah>();
                Buah buf2 = null;
                if (this.connected) {
			String query = "SELECT Id_buah, nama_buah, Harga, Stok, Tanggal_Kadaluarsa FROM db_lemonshop.buah";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				while (resultSet.next()) {
					buf2 = new Buah(resultSet.getString(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getInt(4),resultSet.getDate(5));
                                        
                                        counter++;
                                        buff.add(buf2);
                                        
					
				}
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return buff;
   } 
	 public void Laporan(String No_Laporan , String JenisLaporan, String Tanggal_Laporan) {
		
		if (this.connected) {
			String query = "INSERT INTO Laporan( No_Laporan, JenisLaporan, Tanggal_Laporan ,Kasir, Pegawai) VALUES("+"'" + No_Laporan + "'," + "'" + JenisLaporan + "'" 
					+ "," + "" + Tanggal_Laporan + ","+");";
			try {
                            Statement stmt = this.connection.createStatement();
                            ResultSet resultSet = stmt.executeQuery(query);
                                
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
   
    public List<Laporan> getalllaporan(){
       this.counter = 0;
		List<Laporan> buff = new ArrayList<Laporan>();
                Laporan buf2 = null;
                if (this.connected) {
			String query = "SELECT No_Laporan, JenisLaporan, TanggalLaporan, FROM db_lemonshop.laporan";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				while (resultSet.next()) {
					buf2 = new Laporan(resultSet.getString(1),resultSet.getString(2),resultSet.getDate(3));
                                        
                                        counter++;
                                        buff.add(buf2);
                                        
					
				}
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return buff;
   } 
    
    public void addLaporan(String No_Laporan, String JenisLaporan, String Tanggal_Laporan) {
		
		if (this.connected) {
			String query = "INSERT INTO laporan (No_Laporan, JenisLaporan,TanggalLaporan) VALUES("+"'" + No_Laporan + "'," + "'" + JenisLaporan + "'" 
					+ "," + "" + Tanggal_Laporan + ");";
			try {
                            Statement stmt = this.connection.createStatement();
                            ResultSet resultSet = stmt.executeQuery(query);
                                
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
    
     public void Catatan_restock(String ID_Transaksi, String Tanggal, String nama_buah, String Jumlah, String Supplier, String Harga_beli) {
		
		if (this.connected) {
			String query = "INSERT INTO catatan_restock(ID_Transaksi,Tanggal,nama_buah,Jumlah,Supplier,Harga_beli ) VALUES("+"'" + ID_Transaksi + "'," + "'" + Tanggal + "'" 
					+ "," + "" + nama_buah + ","+"" + Jumlah + "," + "'" + Supplier+ "'," + Harga_beli +");";
			try {
                            Statement stmt = this.connection.createStatement();
                            ResultSet resultSet = stmt.executeQuery(query);
                                
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
     
      public List<Catatan_restock> getallcatatan(){
       this.counter = 0;
		List<Catatan_restock> buff = new ArrayList<Catatan_restock>();
                Catatan_restock buf2 = null;
                if (this.connected) {
			String query = "SELECT ID_Transaksi,Tanggal,nama_buah,Jumlah,Supplier,Harga_beli, FROM db_lemonshop.transaksi_restok";
			try {
				
                                Statement stmt = this.connection.createStatement();
                            
				ResultSet resultSet = stmt.executeQuery(query);
                                
				while (resultSet.next()) {
					buf2 = new Catatan_restock(resultSet.getString(1),resultSet.getDate(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getString(5),resultSet.getInt(6));
                                        counter++;
                                        buff.add(buf2);
                                        
					
				}
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		return buff;
   } 
     
     
     
      public void addcatatan(String ID_Transaksi, String Tanggal, String nama_buah, String Jumlah, String Supplier, String Harga_beli) {
		
		if (this.connected) {
			String query = "INSERT INTO catatan_restock(ID_Transaksi,Tanggal,nama_buah,Jumlah,Supplier,Harga_beli ) VALUES("+"'" + ID_Transaksi + "'," + "'" + Tanggal + "'" 
					+ "," + "" + nama_buah + ","+"" + Jumlah + "," + "'" + Supplier+ "'," + Harga_beli +");";
			try {
                            Statement stmt = this.connection.createStatement();
                            ResultSet resultSet = stmt.executeQuery(query);
                                
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
 public RakBuah Add (String rak_id,String Kapasitas){
             RakBuah rak = null;
               if (this.connected) {
			String query = "UPDATE `db_lemonshop`.`rakbuah` SET `Kapasitas`=  kapasitas +"+ Kapasitas + " WHERE  `ID_Rak`=" + rak_id;
                               
               try {
				
                                Statement stmt = this.connection.createStatement();
                                stmt.executeUpdate(query);
				//ResultSet resultSet = stmt.executeQuery(query);
                                
				//while (resultSet.next()) {
                            //      buah.addStok(resultSet.getString(1), resultSet.getString(2));
                  //                  counter++;
               //  }
                                        
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
               
                     
               }
                  return (rak);
         }

 public void addTransaksi(int harga, int jumlahbuah, int pembayaran, int kembalian, int total) {
		
		if (this.connected) {
			String query = "INSERT INTO `db_lemonshop`.`transaksi` (`pembayaran`, `harga`, `jumlahbuah`, `kembalian`, `total_belanja`) VALUES ("+pembayaran+ harga+ jumlahbuah+kembalian+total+")";
			try {
                            Statement stmt = this.connection.createStatement();
                            ResultSet resultSet = stmt.executeQuery(query);
                                
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
}

