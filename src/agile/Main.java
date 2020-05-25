package agile;

import java.sql.SQLException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		System.out.println("1.Register\n2.Login\nSelect an option");
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		RegisterPojo pojo = new RegisterPojo();
		RegisterDao dao = new RegisterDao();
		LoginPojo pojo1 = new LoginPojo();
		LoginDao dao1 = new LoginDao();
		
		switch(x)
		{
			case 1: System.out.println("Please fill your details:\n");
					System.out.println("Enter First Name: ");
					String firstName = sc.next();
					System.out.println("Enter Last Name: ");
					String lastName = sc.next();
					System.out.println("Enter User Name: ");
					String userName = sc.next();
					System.out.println("Enter Password: ");
					String password = sc.next();
					System.out.println("Enter Email Id: ");
					String emailId = sc.next();
					
					pojo.setFirstname(firstName);
					pojo.setLastname(lastName);
					pojo.setUsername(userName);
					pojo.setPassowrd(password);
					pojo.setEmailid(emailId);
					
					dao.addUser(pojo);
					break;
					
			case 2: System.out.println("EnterEmail: ");
					String loginEmail = sc.next();
					System.out.println("Enter Password: ");
					String loginPassword = sc.next();
					
					pojo1.setEmailid(loginEmail);
					pojo1.setPassword(loginPassword);
					
					if(dao1.validate(pojo1)==true)
					{
						System.out.println("Done!");
						Success obj = new Success();
						obj.display();
					}
					break;	
		}
		sc.close();
	}

}
