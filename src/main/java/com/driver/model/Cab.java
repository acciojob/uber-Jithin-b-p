package com.driver.model;

import javax.persistence.*;

@Entity
public class Cab{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int perKmRate;

    private boolean available;

    @OneToOne
    @JoinColumn
    Driver driver;

    public Cab(){

    }

    public Cab(int perKmRate, boolean available) {
        this.perKmRate = perKmRate;
        this.available = available;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}