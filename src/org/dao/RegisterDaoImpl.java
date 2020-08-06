package org.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.model.Register;

public class RegisterDaoImpl implements RegisterDao {
	
	private Connection con;
	private PreparedStatement stmt;
	
	public RegisterDaoImpl()throws Exception
	{
		com.mysql.jdbc.Driver d=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","admin");
		
		
	}
	
	@Override
	public int isRegister(Register register) {
		// TODO Auto-generated method stub
		int a = 0;
		try {
			stmt=con.prepareStatement("insert into register ( name,email,contact,adharcard,pancard,licenceno,state,district,city,birthdate ) values(?,?,?,?,?,?,?,?,?,?)");
			stmt.setString(1, register.getName());
			stmt.setString(2, register.getEmail());
			stmt.setInt(3,register.getContact());
			stmt.setInt(4, register.getAdharCard());
			stmt.setString(5, register.getPanCard());
			stmt.setString(6, register.getLicenceNo());
			stmt.setString(7, register.getState());
			stmt.setString(8, register.getDistrict());
			stmt.setString(9, register.getCity());
			
//			java.util.Date date = register.getBirthDate();
//			java.sql.Date sqlDate = new java.sql.Date(date.getTime()); 
			
			
			stmt.setDate(10,register.getBirthDate() );
			
			
			a=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	

}
