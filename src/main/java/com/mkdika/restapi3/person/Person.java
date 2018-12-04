/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkdika.restapi3.person;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Person implements Serializable {
    
    @Id
    Integer id;
    
    String firstName;
    
    String lastName;    
}
