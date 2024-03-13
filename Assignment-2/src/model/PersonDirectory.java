/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ABHISHEK PRAKASH
 */
public class PersonDirectory {
    private ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addPerson(){
        Person person = new Person(); 
        personList.add(person);
        return person;
    }
    
    public void deletePerson(Person person){
        personList.remove(person);
    }
    
    public Person searchPerson(String searchText){
        for(int i = 0; i < personList.size(); i++){
            Person person = personList.get(i);
            System.out.println(person.getFirstName());
            if(person.getFirstName().equals(searchText) || person.getLastName().equals(searchText) || person.getHomeStreetAddress().equals(searchText) || person.getWorkStreetAddress().equals(searchText)){
                return person;
            }
        }
        return null;
    }
}
