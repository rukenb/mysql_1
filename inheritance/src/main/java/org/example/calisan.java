package org.example;

public class calisan {
    private String isim;
    private Integer maas;
    private String departman;

    public calisan(String isim,Integer maas,String departman){
        this.isim=isim;
        this.maas=maas;
        this.departman=departman;
    }
    public void bilgigoster(){
        System.out.println("isim: "+isim);
        System.out.println("maas: "+maas);
        System.out.println("departman: "+departman);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Integer getMaas() {
        return maas;
    }

    public void setMaas(Integer maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
