package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.scene.control.Alert;
import models.Food;
import models.User;

public class Controller {
	
	public static User login(String username,String password) {
		 
		User user = new User();
		try (Connection con = DriverManager.getConnection(ConnectionTest.connectionUrl); Statement stmt = con.createStatement();) {
	        String SQL = "SELECT TOP 1 * FROM Users where username = '" + username + "'";
	        ResultSet rs = stmt.executeQuery(SQL);

	        // Iterate through the data in the result set and display it.
	       
	        while (rs.next()) {
	        	if (password.equals(rs.getString("pswd"))) {
	        	
	        	user.setUsername(rs.getString("username"));
	        	user.setPassword(rs.getString("pswd"));
	        	user.setIsAdmin(rs.getBoolean("isAdmin"));

	            //System.out.println(rs.getString("username") + " " + rs.getString("pswd"));
	            //System.out.println(user.getUsername() + " " + user.getPassword());
	        	}
	        	else {
	        	     System.out.println("Password missmatch!");
	        	     
	        	     User wrongUser = new User();
	        	     return wrongUser;
	        	      	}   	
	        }
	    }
	    // Handle any errors that may have occurred.
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
		return user;
	}
	
	public static void insertFood(String foodname, int foodcalories) {
		try (Connection con = DriverManager.getConnection(ConnectionTest.connectionUrl); Statement stmt = con.createStatement();) {
	        String SQL = "INSERT INTO Foods(fName, quantity, calories) VALUES ('" + foodname + "',1," + foodcalories +");";
	        boolean rs = stmt.execute(SQL);
	        
	        if (rs == true) {

	        }
		}
	    // Handle any errors that may have occurred.
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public static Food trackFood(String foodname) {
		
		Food food = new Food();
		food.setFoodname(foodname);
		
		try (Connection con = DriverManager.getConnection(ConnectionTest.connectionUrl); Statement stmt = con.createStatement();) {
	        String SQL = "SELECT TOP 1 * FROM Foods WHERE Foods.fName = '" + foodname + "'";
	        ResultSet rs = stmt.executeQuery(SQL);
	        
	        if(rs.next() == false) {
	        	//System.out.println("No such food in database.");
	        	Alert done = new Alert(Alert.AlertType.INFORMATION);
	    		done.setTitle("Wrong food choice");
	    		done.setContentText("There is no food with the given name in database.");
	    		done.show();
	        }
	        else {
	        	do {
	        		//System.out.print(rs.getString("fName") + " " + rs.getString("calories"));
	        		food.setFoodcals(Integer.parseInt(rs.getString("calories")));
	        }while(rs.next());
		}
		}
	    // Handle any errors that may have occurred.
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
		
		return food;
	}
	
	public static void registerPerson(User user) {
		try (Connection con = DriverManager.getConnection(ConnectionTest.connectionUrl); Statement stmt = con.createStatement();) {
	        String SQL = "INSERT INTO Users(username, pswd, isadmin) VALUES ('" + user.getUsername() + "','" + user.getPassword() +"'," + Boolean.valueOf( user.getIsAdmin() ).compareTo( false ) + ");";
	        boolean rs = stmt.execute(SQL);
	        
	        if (rs == true) {
	        	Alert done = new Alert(Alert.AlertType.INFORMATION);
	    		done.setTitle("Confirmation");
	    		done.setContentText("The new user was added to the database");
	    		done.show();

	        }
		}
	    // Handle any errors that may have occurred.
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
