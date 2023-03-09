package com.dehghan.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {


    /** It's high cost operation
    *private static DBConnection dbConnection
            = new DBConnection();**/

    /**Lazy*/
    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_CONNECTION = "jdbc:h2:mem:test;";
    private static final String DB_USER = "";
    private static final String DB_PASSWORD = "";
    private static DBConnection dbConnection= null;
    private Connection connection;


    private DBConnection(){

        initialConnection();
    }

    private void initialConnection() {

        try {
            //for loading...
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {

            connection = DriverManager.getConnection(DB_CONNECTION,
                    DB_USER,DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Connection getConnection() {
        return connection;
    }

    //public yazamam çünkü o zaman nesne oluşturmadan
    //erişemeyiz
  /**  public static DBConnection getInstance(){
        return  dbConnection;
    }*/

  /***Lazy
  public static DBConnection getInstance(){
      if(dbConnection== null){
          dbConnection = new DBConnection();
      }
      return  dbConnection;
  }*/

  /**Thread safe mode*/
  public static DBConnection getInstance(){
      if (dbConnection == null) {
          //Synchrozed'dan Share Objectımız olduğunda kullanırız.
          synchronized (DBConnection.class) {
              if (dbConnection == null) {
                  dbConnection = new DBConnection();
              }
          }
      }
              return dbConnection;


      }



}
