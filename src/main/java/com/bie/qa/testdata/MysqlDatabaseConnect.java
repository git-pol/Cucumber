package com.bie.qa.testdata;

import com.bie.qa.base.TestBase;
import com.bie.qa.pages.LoginPage;

import java.sql.*;

public class MysqlDatabaseConnect extends TestBase{
	
   private Connection connection;
   private static Statement statement;
   private static ResultSet rs;

    public void setUp() {
            String databaseURL = "jdbc:mysql://localhost:3306/testdata";
            String user = "tester";
            String password = "hazard666";
            connection = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Connecting to Database...");
                connection = DriverManager.getConnection(databaseURL, user, password);
                if (connection != null) {
                    System.out.println("Connected to the Database...");
                }
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
            catch (ClassNotFoundException ex) {
               ex.printStackTrace();
            }
    }

    public void getUserData(String getState) {	
    	LoginPage loginpage = new LoginPage();    	
        try {
            String query = "select * from LoginID";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while(rs.next()){
                String myState= rs.getString("State");
                String myUsername= rs.getString("Username");
                String myPassword=rs.getString("Password");
                int myPproducerCode=rs.getInt("ProducerCode");
                System.out.println(myState+"\t"+myUsername+"\t"+myPassword+"\t"+myPproducerCode);
                loginpage.login(myUsername, myPassword);
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
    
    public void getBusinessAddress() {	  	
        try {
            String query = "select * from BusinessAddress WHERE `State`='AZ'";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while(rs.next()){
                String myState= rs.getString("State");
                String myBusinessName= rs.getString("BusinessName");
                String myAddress=rs.getString("Address");
                String myCity=rs.getString("City");
                int myZipCode=rs.getInt("ZipCode");
                
                System.out.println(myState+"\t"+myBusinessName+"\t"+myAddress+"\t"+myCity+"\t"+myZipCode);
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }

    public void tearDown() {
      if (connection != null) {
                try {
                    System.out.println("Closing Database Connection...");
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
      }
}