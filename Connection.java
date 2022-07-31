package Task_1;

import java.sql.*;
public class Connection
{
		public Connection con;
		public Connection()
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver loaded...");
				
				con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
				System.out.println("Connected....");
			}
			catch(Exception e1)
			{
				System.out.println("Connection failed:"+e1);
			}
		}
		public Statement createStatement1() {
			// TODO Auto-generated method stub
			return null;
		}
		public PreparedStatement prepareStatement(String string) {
			// TODO Auto-generated method stub
			return null;
		}
		public Statement createStatement(int typeScrollInsensitive, int concurReadOnly) {
			// TODO Auto-generated method stub
			return null;
		}
		public Statement createStatement11() {
			// TODO Auto-generated method stub
			return null;
		}
} 