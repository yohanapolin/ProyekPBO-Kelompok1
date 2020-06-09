package ProyekPBO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ProyekPBO.*;
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
        
        
        public void Buah(String NamaBuah, String Harga,String Stok, String Tanggal) {
		
		if (this.connected) {
			String query = "INSERT INTO Buah( NamaBuah, Harga ,Stok, Kadaluarsa) VALUES(" + "'" + NamaBuah + "'" 
					+ "," + "'" + Harga + "',"+"'" + Stok + "'," + "'" + Tanggal + "'" +");";
			try {
                            Statement stmt = this.connection.createStatement();
                            ResultSet resultSet = stmt.executeQuery(query);
                                
				
			} catch (Exception _e) {
				
                                System.out.println("Exception: " + _e.getMessage());
			}
		}
		
	}
}
