/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkdika.restapi3.person;

import java.util.List;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public interface PersonService {
    
    List<Person> getPersons();
    
    Person getPersonById(Integer id);
    
}
