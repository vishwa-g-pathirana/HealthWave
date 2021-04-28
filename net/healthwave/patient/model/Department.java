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
public class Department {
    
    private int id;
    private String depName;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Department(int id, String depName, String status) {
        this.id = id;
        this.depName = depName;
        this.status = status;
    }

    public Department(String depName, String status) {
        this.depName = depName;
        this.status = status;
    }
    
}
