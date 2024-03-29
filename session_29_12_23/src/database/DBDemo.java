package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBDemo 
{
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tns","root","Mganesh@202");
		System.out.println("Established Connection");
		
		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee ID =");
		int id = s.nextInt();
		System.out.println("Enter Employee Name =");
		String name = s.next();
		System.out.println("Enter Employee Salary =");
		float sal = s.nextFloat();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setFloat(3, sal);
		
		int i = pstmt.executeUpdate();
		
		if(i>0)
		System.out.println("Employee Record Successfully Inserted!!");
		else
			System.out.println("FAILED!!");	
		
		PreparedStatement pstmt1 = con.prepareStatement("select *from employee");
		ResultSet rs = pstmt1.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+" "+rs.getFloat(3));
		}
	}
}
