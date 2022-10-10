package com.example.personservice.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "address")
    private String address;

    @Column(name = "postcode")
    private String postcode;

    @Column(name = "job")
    private String job;

    @Column(name = "email")
    private String email;

    @Column(name = "phoneno")
    private String phoneno;

    public Person() {}

    public Person(String name, int age, String address, String postcode, String job, String email, String phoneno) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.postcode = postcode;
        this.job = job;
        this.email = email;
        this.phoneno = phoneno;
    }



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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

}
