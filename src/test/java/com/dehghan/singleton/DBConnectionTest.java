package com.dehghan.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

class DBConnectionTest {

    @DisplayName("Get Instance Test")
    @Test
    void getInstance() {

        DBConnection dbConnection = DBConnection.getInstance();
        String createQuery = "CREATE TABLE PERSON (id int primary key, name varchar(50))";
       Connection connection = dbConnection.getConnection();
        //Try with Resource : parantez içersinde tanımladığımız herşey
        // otomatk olarak kapanıyor.
       try (Statement statement = connection.createStatement();){
           statement.execute(createQuery);

       } catch (SQLException e) {
           e.printStackTrace();
       }

       String insertQuery = "INSERT INTO PERSON (id, name) values (?,?)";
       try(PreparedStatement preparedStatement =
               connection.prepareStatement(insertQuery)) {
           preparedStatement.setInt(1,1);
           preparedStatement.setString(2, "Parivash Dehghan");
           preparedStatement.executeUpdate();

           preparedStatement.setInt(1,2);
           preparedStatement.setString(2, "Tania Dehghan");
           preparedStatement.executeUpdate();

       } catch (SQLException e) {
           e.printStackTrace();
       }
       String selectQuery = "select count(*) from PERSON";
       try (Statement query = connection.createStatement()){
           try (ResultSet resultSet = query.executeQuery(selectQuery)){
               if(resultSet.next()){

                   System.out.println("This COUNT IS :" + resultSet.getInt(1));
                    assertEquals(resultSet.getInt(1),2);
               }

           }

       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
    }

    @Test
    void performanceTest(){
        long time = System.currentTimeMillis();
        System.out.println(DBConnection.getInstance());
        System.out.println(System.currentTimeMillis() -time);

        time = System.currentTimeMillis();
        System.out.println(DBConnection.getInstance());
        System.out.println(System.currentTimeMillis() - time);
    }
}