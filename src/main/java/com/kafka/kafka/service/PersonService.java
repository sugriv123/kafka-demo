package com.kafka.kafka.service;


import com.kafka.kafka.entity.Person;
import com.kafka.kafka.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void savePersonData(Person person){
        personRepository.save(person);
    }
    public Optional<Person> getDataById(Integer id){
        return personRepository.findById(id);
    }
}
