/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Persona;

/**
 *
 * @author kal bugrara
 */

import model.workareas.Workarea;

/**
 *
 * @author kal bugrara
 */
public class UserAccount {
    Person person;
    Workarea landingworkarea;
    
    public UserAccount(Person p){
        person = p;
    }
    
}