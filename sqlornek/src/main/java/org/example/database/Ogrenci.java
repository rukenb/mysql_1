package org.example.database;

public class Ogrenci {
    private  Integer id;
    private  String name;
    private  Integer age;
    private  Boolean active;

    public Ogrenci(Integer id,String name,Integer age,Boolean active){
        this.id=id;
        this.name=name;
        this.age=age;
        this.active=active;
    }

    @Override
    public String toString() {
        String donustur = "id: " +id+" name : "+name+" age: "+age+" active: "+(active );
        return donustur;
    }

    public Ogrenci(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }



}
