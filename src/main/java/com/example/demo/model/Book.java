package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long packageNumber;
    @Column(nullable = false)
    private String pickUptime;

    public Book() {
    }

    public Long getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(Long packageNumber) {
        this.packageNumber = packageNumber;
    }

    public String getPickUptime() {
        return pickUptime;
    }

    public void setPickUptime(String pickUptime) {
        this.pickUptime = pickUptime;
    }
}
