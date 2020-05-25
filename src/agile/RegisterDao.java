package agile;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao 
{
	public void addUser(RegisterPojo pojo) throws ClassNotFoundException, SQLException
	{
		String firstname = pojo.getFirstname();
		String lastname = pojo.getLastname();
		String username = pojo.getUsername();
		String password = pojo.getPassowrd();
		String emailid = pojo.getEmailid();
		
		ConnectionManager cm = new ConnectionManager();
		System.out.println("");
		String sql = "INSERT into UserData(firstname, lastname, username, password, emailid) VALUES (?,?,?,?,?)";
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		System.out.println("Statement Prepared");
		st.setString(1, firstname);
		st.setString(2, lastname);
		st.setString(3, username);
		st.setString(4, password);
		st.setString(5, emailid);
		
		st.executeUpdate();
		System.out.println("Data Inserted");
		cm.getConnection().close();
	}
}
