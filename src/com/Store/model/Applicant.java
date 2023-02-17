package com.Store.model;

import com.Store.enumeration.Gender;

public class Applicant extends Person{

    private int yearsOfExperience;
    private Gender gender;

    public Applicant() {
        super();
    }


    public Applicant( String firstName, String lastName, Double age, Gender gender, int yearsOfExperience ) {
        super( firstName, lastName , age);
        this.gender = gender;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Applicant{firstName" + super.getFirstName() + " lastName: " + super.getLastName() +
                " Age: " + super.getAge() + " Gender: " + gender +
                "yearsOfExperience=" + yearsOfExperience +
                 +
                '}';
    }
}
