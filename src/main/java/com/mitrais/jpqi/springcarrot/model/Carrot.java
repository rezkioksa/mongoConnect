package com.mitrais.jpqi.springcarrot.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "carrots")
public class Carrot {
    @Id
    private int id;
    private String type;
    private String basketFrom;
    private String basketTo;
    private Employee employee;

    public Carrot() {}

    public Carrot(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
