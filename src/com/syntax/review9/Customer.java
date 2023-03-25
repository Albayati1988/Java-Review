package com.syntax.review9;

public class Customer {
    private String name;
    private long ssn;

    public Customer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public Customer(String name, long ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
