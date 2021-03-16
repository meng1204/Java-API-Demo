package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

/***
 *
 * interface: insert a person into database
 */
public interface PersonDao {

    /**
     * insert a person with an ID
     * @param id
     * @param person
     * @return
     */
    int insertPerson(UUID id, Person person);

    /**
     * add person to person, automatically generate id
     * @param person
     * @return
     */
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

}
