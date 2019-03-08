package com.mitrais.jpqi.springcarrot.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.math.BigInteger;

//@Document(collection = "#{Carrot.getCollectionName()}")
@Document(collection = "carrots")
public class Carrot {
    @Id
    private BigInteger id;
    private String type;
    private String basketFrom;
    private String basketTo;
    private Employee employee;

    public Carrot() {}

//    public Carrot(int id, String type) {
//        this.id = id;
//        this.type = type;
//    }

    public Carrot(BigInteger id, String type) {
        this.id = id;
        this.type = type;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    //    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBasketFrom() {
        return basketFrom;
    }

    public void setBasketFrom(String basketFrom) {
        this.basketFrom = basketFrom;
    }

    public String getBasketTo() {
        return basketTo;
    }

    public void setBasketTo(String basketTo) {
        this.basketTo = basketTo;
    }
}
