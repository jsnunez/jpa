package com.jsnunez.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jsnunez.jpa.entities.Person;

public interface PersonRepository extends CrudRepository<Person,Long>{
 List<Person> findByProgrammingLanguage(String programmingLanguage);
    
    @Query("select p from Person p where p.programmingLanguage=?1 and p.name=?2")
    List<Person> buscarByProgrammingLanguage(String programmingLanguage, String name);
}
