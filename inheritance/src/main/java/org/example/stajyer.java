package org.example;

import java.util.Scanner;

public class stajyer extends calisan {
    private String dil;


    public stajyer(String isim, Integer maas, String departman,String dil) {
        super(isim, maas, departman);
        this.dil=dil;

    }

    @Override
    public void bilgigoster() {
        super.bilgigoster();
        System.out.println("Öğrendiği dil: "+dil);
    }

    public void Avans(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Avans almak istediğiniz miktarı giriniz");
        Integer avans= scanner.nextInt();
    }

    public String getDil() {
        return dil;
    }

    public void setDil(String dil) {
        this.dil = dil;
    }
}
