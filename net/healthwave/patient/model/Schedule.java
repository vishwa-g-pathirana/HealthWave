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
public class Schedule {
    
    private int id;
    private String dName;
    private String department;
    private String date;
    private String time;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Schedule(String dName, String department, String date, String time, String status) {
        this.dName = dName;
        this.department = department;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public Schedule(int id, String dName, String department, String date, String time, String status) {
        this.id = id;
        this.dName = dName;
        this.department = department;
        this.date = date;
        this.time = time;
        this.status = status;
    }
    
    
}
