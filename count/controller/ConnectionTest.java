package controller;

import javax.swing.JOptionPane;

public final class ConnectionTest {
	
	public static String connectionUrl = "jdbc:sqlserver://DESKTOP-DDSVA7K;database=Foods;integratedSecurity=true";

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
		JOptionPane.showMessageDialog(null, "Connected");
	
		}
}
