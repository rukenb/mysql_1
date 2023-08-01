package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Giriş Türünü Seçiniz.......... ");
        System.out.println("1.Stajyer Girişi\n"
                         +"2.Yönetici Girişi");
        Integer giris= scanner.nextInt();
            if (giris.equals(1)){
                System.out.println("Yapmak istediğiniz işlemi Seçiniz..........");
                System.out.println("1.Avans iste\n"
                                  + "2.İzin iste");
                Integer islem=scanner.nextInt();
                if (islem.equals(1)){
                    System.out.println("Avans istediğiniz miktarı giriniz");
                    Integer avans=scanner.nextInt();
                    if (avans<=2000){
                        System.out.println("Avans isteğiniz onaylanmıştır");
                    }
                    else System.out.println("avans 2000 tl den fazla olamaz");
                }
                else if (islem.equals(2)){
                    System.out.println("izin isteğiniz gün sayısını giriniz");
                    int izin=scanner.nextInt();
                    if (izin==1){
                        System.out.println("izin verildi");
                    }
                    else System.out.println("sadece bir gün izin isteyebilirsiniz");
                }
            }

            else if (giris.equals(2)){
                System.out.println("Yapmak istediğiniz işlemi Seçiniz..........");
                System.out.println("1.Zam Yap \n"
                                 + "2 bilgileri göster");
                Integer islem2=scanner.nextInt();
                if (islem2.equals(1)){
                    Yonetici yonetici=new Yonetici("ali",0,"software",16,"python,java,react");
                    System.out.println("zam yapmak istediğiniz tutarı giriniz");
                    int zamMiktari=scanner.nextInt();
                    yonetici.zamYap(zamMiktari);
                } else if (islem2.equals(2)) {
                    Yonetici yonetici=new Yonetici("ali",0,"software",16,"python,java,react");
                    yonetici.bilgigoster();
                }

            }




        /*stajyer stajyer= new stajyer("Ruken Bingöl ",0,"software","java");

        stajyer.bilgigoster();


        Yonetici yonetici=new Yonetici("ali",0,"software",16,"python,java,react");
        yonetici.bilgigoster();

        */
    }
}