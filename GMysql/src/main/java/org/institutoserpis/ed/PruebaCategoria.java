
package org.institutoserpis.ed;

import java.sql.*;

public class PruebaCategoria {
	
	public static void main (String []args) throws SQLException{
		 
		Connection connection =DriverManager.getConnection
				("jdbc:mysql://localhost/dbprueba","root", "sistema");
		
		Statement selectStatement = connection.createStatement();
		ResultSet resultSet=selectStatement.executeQuery("select * from categoria");
		while (resultSet.next()){
			System.out.printf("id=%s nombre=%s \n" , resultSet.getObject("id"), resultSet.getObject("nombre"));
		}
		//Todo lo que se quiera hacer...
		
		selectStatement.close();
		connection.close();
		
		System.out.println();
		System.out.println("fi");
	}
}
