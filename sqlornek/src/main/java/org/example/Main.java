package org.example;

import org.example.database.DBOparation;
import org.example.database.Ogrenci;
import org.example.database.OgrenciServisi;

import java.sql.*;
import java.util.List;

public class Main {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        OgrenciServisi ogrenciServisi =new OgrenciServisi();
        List<Ogrenci> myOgrenciList = ogrenciServisi.ogrenciListDon();

        myOgrenciList.forEach(ogrenci -> System.out.println(ogrenci.getName()));

        myOgrenciList.forEach(ogrenci -> System.out.println(ogrenci));

        /*
        for (Ogrenci temp:myOgrenciList){
            System.out.println(temp);
        }
        */






    }
}
