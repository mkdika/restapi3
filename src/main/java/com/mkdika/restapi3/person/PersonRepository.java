
package com.mkdika.restapi3.person;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
public interface PersonRepository extends CrudRepository<Person, Integer> {
    
}
