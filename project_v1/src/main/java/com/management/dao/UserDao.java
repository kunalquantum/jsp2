package com.management.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.management.bean.User;
public class UserDao {
	private String jdbcurl="jdbc:mysql://localhost:3306/userdb?userSSL=false";
	private String jdbcUsername="root";
	private String jdbcPassword="roott";
	private String jdbcDriver="com.mysql.jdbc.driver";
	
	private static final String INSERT_USER_SQL="INSERT INTO users "+"(name,email,country) VALUES"+
	"(?,?,?);";
	
	private static final String SELECT_USER_BY_ID="SELECT NAME,EMAIL,COUNTRY FROM user WHERE id=?";
	private static final String SELECT_ALL_USERS="SELECT * FROM user";
	private static final String DELETE_USER_BY_ID="DELETE FROM USER WHERE id=?";
	private static final String UPDATE_USER_BY_ID="UPDATE user SET name=?,email=?,country=? where id=?";
	
	
	public UserDao() {
		
		
		}
	
	protected Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName(jdbcDriver);
			connection=DriverManager.getConnection(jdbcurl,jdbcUsername,jdbcPassword);
			
		}
		catch(SQLException e){
			e.printStackTrace();
			
		}
		catch(ClassNotFoundException e ) {
			e.printStackTrace();
			
			}
		return connection;
	} 
	
	//insert user 
	
	public void insert_user(User user) {
		System.out.println(INSERT_USER_SQL);
		try(
				Connection connection=getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USER_SQL)){
			preparedStatement.setString(1,user.getName());
			preparedStatement.setString(2,user.getEmail());
			preparedStatement.setString(3,user.getCountry());
			
		
			
		}
		
 catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}
	
	public User SelectUser(int id) {
	
		User u=null;
		try (

				Connection connection=getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(SELECT_USER_BY_ID)){
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			
			ResultSet rs=preparedStatement.executeQuery();
			
			while(rs.next()) {
			String name=rs.getString("name");
			String email=rs.getString("email");
			String country=rs.getString("country");
			u = new User(id,name,email,country);
			
			
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return u;
		
	}	
	
	public List<User> SelectallUsers(){
		List<User> users=new ArrayList<>();
		try (

				Connection connection=getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(SELECT_ALL_USERS)){
			
			System.out.println(preparedStatement);
			
			ResultSet rs=preparedStatement.executeQuery();
			
			while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String email=rs.getString("email");
			String country=rs.getString("country");
			users.add( new User(id,name,email,country));
			
			
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return users;}
		
		
	
	public boolean UpdateUser(User user)throws SQLException{
		 boolean rowUpdated;
		try (

			Connection connection=getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement( UPDATE_USER_BY_ID)){
		
			System.out.println("Update Query : "+preparedStatement);
			
			 preparedStatement.setString(1,user.getName());
			 preparedStatement.setString(1,user.getName());
			 preparedStatement.setString(1,user.getName());
			 preparedStatement.setInt(4, user.getId());
			 
			 rowUpdated=preparedStatement.executeUpdate()>0;
			 
			}
		 return rowUpdated;
		 }
	public boolean deleteUsersByID(int id ) throws SQLException{
		
		boolean RowDeleted;
		try (

				Connection connection=getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(DELETE_USER_BY_ID)){
			
				System.out.println("Delete Query : "+preparedStatement);
				
				
				 preparedStatement.setInt(1, id);
				 
				 RowDeleted=preparedStatement.executeUpdate()>0;
				 
				 
				}
		
		return RowDeleted;
			
			 }
	 
		
				
				
		
	}



