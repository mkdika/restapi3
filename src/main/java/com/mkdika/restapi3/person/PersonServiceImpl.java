
package com.mkdika.restapi3.person;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
@Service
public class PersonServiceImpl implements PersonService{
    
    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        Person p = new Person();
        this.personRepository = personRepository;
    }
    
    @Override
    public List<Person> getPersons() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public Person getPersonById(Integer id) {
        return personRepository.findById(id).get();
    }
}
