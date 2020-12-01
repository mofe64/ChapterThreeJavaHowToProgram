package com.company;

import java.time.Year;

public class HealthProfile {
    String firstName;
    String lastName;
    String gender;
    int monthOfBirth;
    int dayOfBirth;
    int yearOfBirth;
    Date dateOfBirth;
    int heightInInches;
    int weightInPounds;

    public HealthProfile(String firstName, String lastName, String gender, int monthOfBirth, int dayOfBirth, int yearOfBirth, int heightInInches, int weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
        this.dateOfBirth = new Date(monthOfBirth, dayOfBirth, yearOfBirth);
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMonthOfBirth() {
        return dateOfBirth.getMonth();
    }

    public void setMonthOfBirth(int monthOfBirth) {
        dateOfBirth.setMonth(monthOfBirth);
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dateOfBirth.getDay();
    }

    public void setDayOfBirth(int dayOfBirth) {
        dateOfBirth.setDay(dayOfBirth);
        this.dayOfBirth = dayOfBirth;
    }

    public int getYearOfBirth() {
        return dateOfBirth.getYear();
    }

    public void setYearOfBirth(int yearOfBirth) {
        dateOfBirth.setYear(yearOfBirth);
        this.yearOfBirth = yearOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public int getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public int getAge(){
        return Year.now().getValue() - dateOfBirth.getYear();
    }

    public int getMaximumHeartRate(){
        return 220 - getAge();
    }

    public void getTargetHeartRange(){
        System.out.println("Target Heart Range is between " + ((50 * getMaximumHeartRate()) / 100) + "and " +
                ((85 * getMaximumHeartRate()) / 100)
        );
    }
    public void calculateBMI(){
        int BMI = weightInPounds * 703 / (heightInInches * heightInInches);
        System.out.println("Bmi is " + BMI);
    }

}
