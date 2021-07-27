package model;

public class Student {
    private String name;
    private int age;
    private char gender;
    private String id_No;

    public Student(String name, int age, char gender, String id_No ){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id_No = id_No;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId_No(){
        return id_No;
    }
    public void setId_No(String id_No){
        this.id_No = id_No;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

}
