/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ABHISHEK PRAKASH
 */
public class Person {
    private String firstName;
    private String lastName;
    private String ssn;
    private String license;
    
    Address workAddress = new Address();
    Address homeAddress =  new Address();

    public String getFirstName() {
        return firstName;
    }

    public Address getWorkAddress() {
        return workAddress;
    }
    
    public String getWorkStreetAddress(){
        return workAddress.streetAddress;
    }
    
    public String getHomeStreetAddress(){
        return homeAddress.streetAddress;
    }
    
    public String getWorkUnitNumber(){
        return workAddress.unitNumber;
    }
    
    public String getHomeUnitNumber(){
        return homeAddress.unitNumber;
    }
    
    public String getWorkState(){
        return workAddress.state;
    }
    
    public String getHomeState(){
        return homeAddress.state;
    }
    
    public String getWorkCity(){
        return workAddress.city;
    }
    
    public String getHomeCity(){
        return homeAddress.city;
    }
    
    public String getWorkZipCode(){
        return workAddress.zipCode;
    }
    
    public String getHomeZipCode(){
        return homeAddress.zipCode;
    }

    public void setWorkAddress(String streetAddress, String unitNumber, String city, String state, String zipCode) {
        this.workAddress.streetAddress = streetAddress;
        this.workAddress.unitNumber = unitNumber;
        this.workAddress.city = city;
        this.workAddress.state = state;
        this.workAddress.zipCode = zipCode;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String streetAddress, String unitNumber, String city, String state, String zipCode) {
        this.homeAddress.streetAddress = streetAddress;
        this.homeAddress.unitNumber = unitNumber;
        this.homeAddress.city = city;
        this.homeAddress.state = state;
        this.homeAddress.zipCode = zipCode;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
    
    @Override
    public String toString(){
        return firstName;
    }
    
}
