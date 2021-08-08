/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egemen
 */
public class Employee extends Person {
    
    private String job;
    private String department;
    private int id;

    


   
    public Employee(String name, String address, long phone, int hes_code, int age,String job, String department, int id) {
        super(name, address, phone, hes_code, age);
        this.job = job;
        this.department = department;
        this.id = id; 
        
        
    }


    
    
    
    
    //<editor-fold defaultstate="collapsed" desc="GETTER&SETTERS">
    
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
     public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
 //</editor-fold> 

    @Override
    public void showInfos() {
        super.showInfos(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(this.getName() + "'s job is " + this.job);
        System.out.println(this.getName() + "'s department is " + this.department);
        System.out.println(this.getName() + "'s id is " + this.id);
    }
    
    
    
    
}

    

