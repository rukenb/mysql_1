package org.example.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OgrenciServisi {
    private static final String USER_SELECT_STRING = "select * from ogrenciler";

   private static final String updateQuery = "UPDATE ogrenciler set name = ? Where id =?";
    private static final String insertQuery = "INSERT INTO ogrenciler (id,name,age,active)VALUES(?,?,?,?)";

   private static final String deleteQuery = "DELETE FROM ogrenciler WHERE id=? ";



    public List<Ogrenci> ogrenciListDon() throws SQLException {
        ResultSet myResultSet = DBOparation.resultSet(USER_SELECT_STRING);
        List<Ogrenci> ogrenciList = new ArrayList<>();
        while (myResultSet.next()){
            Ogrenci ogrenci=new Ogrenci();
            ogrenci.setId(myResultSet.getInt("id"));
            ogrenci.setName(myResultSet.getString("name"));
            ogrenci.setAge(myResultSet.getInt("age"));
            ogrenci.setActive(myResultSet.getBoolean("active"));

            ogrenciList.add(ogrenci);

        }

        return ogrenciList;
    }



}


