package org.example.database;
import java.sql.*;
public class DBOparation {

    private static final String connectionUrl="jdbc:mysql://localhost:3306/sys";
    private static final String userName="root";
    private static final String password="6424235";


    public static Connection openConnection () throws SQLException {

        return DriverManager.getConnection(connectionUrl, userName,password);

    }
    public  static ResultSet resultSet (String selectSql) throws SQLException {
         Connection myConnection =openConnection();
            Statement myConnectionStatement = myConnection.createStatement();
            ResultSet myResultSet = myConnectionStatement.executeQuery(selectSql);
            return myResultSet;

        }



    public static Integer updateProcess(String oneParamUpdateSql,String oneParamUpdateSql2,String oneParamUpdateSql3){
        try (Connection myConnection = openConnection()){
            PreparedStatement myPreparedStatement = myConnection.prepareStatement(oneParamUpdateSql);
            myPreparedStatement.setString(1,oneParamUpdateSql2);
            myPreparedStatement.setString(2,oneParamUpdateSql3);
            return myPreparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer insertProcess(String oneParamUpdateSql,String id,String name,String age,String active){
        try (Connection myConnection = openConnection()){

            PreparedStatement myPreparedStatement= myConnection.prepareStatement(oneParamUpdateSql);
            myPreparedStatement.setString(1,id);
            myPreparedStatement.setString(2,name);
            myPreparedStatement.setString(3,age);
            myPreparedStatement.setString(4,active);

            return myPreparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static Integer deleteProcess(String oneParamUptadeSql,String id){
        try (Connection myConnection=openConnection()){
            PreparedStatement myPreparedStatement= myConnection.prepareStatement(oneParamUptadeSql);
            myPreparedStatement.setString(1,id);
            return myPreparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }





}

