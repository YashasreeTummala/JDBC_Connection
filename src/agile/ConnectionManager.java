package agile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager 
{
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = null;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "system", "Timepa$$9");
		
		if(con == null)
			System.out.println("Connection is not Established");
		else if(con != null)
			System.out.println("Connection Established");
		
		return con;
	}
}
