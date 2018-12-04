/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkdika.restapi3.person;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
@RestController
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/api/persons")
    public ResponseEntity getAllPerson() {
        List<Person> persons = personService.getPersons();
        if (persons.size() > 0) {
            return new ResponseEntity(persons, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }

    @GetMapping("/api/persons/{id}")
    public ResponseEntity getPersonById(@PathVariable Integer id) {
        Person person = personService.getPersonById(id);
        if (person != null) {
            return new ResponseEntity(person, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
