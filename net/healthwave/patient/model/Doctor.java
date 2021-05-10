/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.healthwave.patient.model;

/**
 *
 * @author Sparrow009
 */
public class Doctor {
    private int id;
    private String dname;
    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Doctor(String dname, String department) {
        this.dname = dname;
        this.department = department;
    }

    public Doctor(int id, String dname, String department) {
        this.id = id;
        this.dname = dname;
        this.department = department;
    }
    
}
