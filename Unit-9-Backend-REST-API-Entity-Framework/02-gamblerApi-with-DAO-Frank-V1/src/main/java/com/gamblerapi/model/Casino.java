package com.gamblerapi.model;

import java.util.Objects;

public class Casino {

    //define data members for class

    private String casinoName;
    private String location;
    private String owner;
    private int size;

    //Constructor
    public Casino(){}
    public Casino(String casinoName, String location, String owner, int size) {
        this.casinoName = casinoName;
        this.location = location;
        this.owner = owner;
        this.size = size;
    }

    //Getters and Setters
    public String getCasinoName() {
        return casinoName;
    }
    public void setCasinoName(String casinoName) {
        this.casinoName = casinoName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    //Overrides for standard operations where the default behavior is undesireable


    @Override
    public String toString() {
        return "Casino{" +
                "casinoName='" + casinoName + '\'' +
                ", location='" + location + '\'' +
                ", owner='" + owner + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Casino casino)) return false;
        return size == casino.size && Objects.equals(casinoName, casino.casinoName) && Objects.equals(location, casino.location) && Objects.equals(owner, casino.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(casinoName, location, owner, size);
    }
}
