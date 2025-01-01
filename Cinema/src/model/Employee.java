
package model;

public class Employee {
  
    private String EmployeeID, nameEmployee , position, date,address,phoneNumber,email, gender;
    private int salary; 
    public Employee() {
    }

    public Employee(String EmployeeID, String nameEmployee, String position, String date, String address, String phoneNumber, String email, String gender, int salary) {
        this.EmployeeID = EmployeeID;
        this.nameEmployee = nameEmployee;
        this.position = position;
        this.date = date;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setName(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
