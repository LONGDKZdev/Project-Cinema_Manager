package model;

public class Employee {
    private String employeeID, nameEmployee, position, date, address, phoneNumber, email, gender;
    private int salary;

    public Employee() {
    }

    public Employee(String employeeID, String nameEmployee, String position, String date, String address, String phoneNumber, String email, String gender, int salary) {
        this.employeeID = employeeID;
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
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        if (employeeID == null || employeeID.isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be null or empty.");
        }
        this.employeeID = employeeID;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        if (nameEmployee == null || nameEmployee.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
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
        if (salary < 0) {
            throw new IllegalArgumentException("Salary must be a positive integer.");
        }
        this.salary = salary;
    }
}
