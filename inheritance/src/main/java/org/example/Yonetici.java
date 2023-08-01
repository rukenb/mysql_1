package org.example;

public class Yonetici extends calisan{

    private Integer sorumluSayisi;
    private String dil;
    public Yonetici(String isim, Integer maas, String departman,Integer sorumluSayisi,String dil) {
        super(isim, maas, departman);
        this.sorumluSayisi=sorumluSayisi;
        this.dil=dil;
    }

    public void zamYap(int zamMiktari){
        System.out.println(getIsim()+"çalışanlara "+zamMiktari+"kadar zam yapılıyor");
    }
    @Override
    public void bilgigoster() {
        super.bilgigoster();
        this.dil=dil;
        this.sorumluSayisi=sorumluSayisi;
        System.out.println("Eğitim verdiği kişi sayısı:  "+sorumluSayisi);
        System.out.println("Bildiği diller:  "+dil);
    }

    public Integer getSorumluSayisi() {
        return sorumluSayisi;
    }

    public void setSorumluSayisi(Integer sorumluSayisi) {
        this.sorumluSayisi = sorumluSayisi;
    }

    public String getDil() {
        return dil;
    }

    public void setDil(String dil) {
        this.dil = dil;
    }



}
