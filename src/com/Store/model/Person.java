package com.Store.model;


import com.Store.enumeration.Role;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int id;
    private Double age;
    private Role role;

    public Person() {

    }

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    //Applicant
    public Person(String firstName, String lastName, Double age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



    public Person(String firstName, String lastName , int id, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id" + id +
                ", age=" + age +
                '}';
    }
}
