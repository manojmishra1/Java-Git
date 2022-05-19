/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.git;

/**
 *
 * @author dj
 */
public class Employee {

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String Ename) {
        this.Ename = Ename;
    }

    public String getEsalary() {
        return Esalary;
    }

    public void setEsalary(String Esalary) {
        this.Esalary = Esalary;
    }
   private int Id;
   private String Ename,Esalary;

    public Employee(int Id, String Ename, String Esalary) {
        this.Id = Id;
        this.Ename = Ename;
        this.Esalary = Esalary;
    }
   
   
}
