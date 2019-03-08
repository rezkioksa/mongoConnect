package com.mitrais.jpqi.springcarrot.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.math.BigInteger;
import java.time.LocalDate;

@Document(collection = "employees")
public class Employee {
//    public enum EmployeeType {STAFF, MANAGER, FARMER};

    @Id
    private BigInteger id;
    private String address;
    private String dob;
    private String type;
    private String name;
    private String username;
    private String password;
    private String profilePicture;

    public Employee() {}

//    public Employee(int id, String name, String basket, String status) {
//        this.id = id;
//        this.name = name;
//        this.basket = basket;
//        this.status = status;
//    }



    public Employee(BigInteger id, String type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}
