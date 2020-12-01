package com.company;

import java.time.Year;

public class TargetHeartRateCalculator {
    String firstName;
    String lastName;
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;
    Date dateOfBirth;

    public TargetHeartRateCalculator(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        dateOfBirth = new Date(monthOfBirth, dayOfBirth, yearOfBirth);
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDayOfBirth() {
        return dateOfBirth.getDay();
    }

    public int getMonthOfBirth() {
        return dateOfBirth.getMonth();
    }

    public int getYearOfBirth() {
        return dateOfBirth.getYear();
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDayOfBirth(int dayOfBirth) {
        dateOfBirth.setDay(dayOfBirth);
        this.dayOfBirth = dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        dateOfBirth.setMonth(monthOfBirth);
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        dateOfBirth.setYear(yearOfBirth);
        this.yearOfBirth = yearOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int getAge(){
         return Year.now().getValue() - yearOfBirth;
    }

    public int getMaxHeartRate(){
        return 220 - getAge();
    }

    public void getTargetHeartRange(){
        System.out.println("Target Heart Range is between " + ((50 * getMaxHeartRate()) / 100) + "and " +
                ((85 * getMaxHeartRate()) / 100)
        );
    }
}
