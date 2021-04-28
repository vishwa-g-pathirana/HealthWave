
package net.healthwave.patient.model;

/**
 *
 * @author Sparrow009
 */
public class Appointment {
    
    private int id;
    private String name;
    private String age;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
    

    public Appointment(int id, String name, String age, String dName, String department, String date, String time, String status) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.dName = dName;
        this.department = department;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public Appointment(String name, String age, String dName, String department, String date, String time, String status) {
        super();
        this.name = name;
        this.age = age;
        this.dName = dName;
        this.department = department;
        this.date = date;
        this.time = time;
        this.status = status;
    }
    
    
    
    
}
