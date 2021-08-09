/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egemen
 */
public class Person {
    
    private String name;
    private int age;
    private String address;
    private long phone;
    private int hes_code;
    private String job;
    private String department;
    private int id;
   

    public Person(String name, String address, long phone, int hes_code, int age) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.hes_code = hes_code;
        this.age= age;
    }
    
    public void showInfos(){
    
    System.out.println("your name is " + this.name);
    System.out.println(this.name + "'s address is " + this.address);
    System.out.println(this.name + "'s telephone number is " + this.phone);
    System.out.println(this.name + "'s hes code is " + this.hes_code);
    System.out.println(this.name + "'s age is " + this.age);
    
}
  

    //<editor-fold defaultstate="collapsed" desc="GETTER&SETTERS">
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHes_code() {
        return hes_code;
    }

    public void setHes_code(int hes_code) {
        this.hes_code = hes_code;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    //</editor-fold> 

   
  
}
