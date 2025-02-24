package com.kafka.kafka.controller;

import com.kafka.kafka.entity.Person;
import com.kafka.kafka.exception.EntityNotFoundException;
import com.kafka.kafka.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/personData")
public class PersonController {

     @Autowired
    PersonService personService;

     @PostMapping("/save")
     public void savePersonData(@RequestBody Person person){

         personService.savePersonData(person);
     }

        @GetMapping("/{id}")
         public Optional<Person> getDataById(@PathVariable("id") Integer id) throws EntityNotFoundException {

         if(id!=2){
             throw new EntityNotFoundException("No record found in database.");
         }
            return personService.getDataById(id);

         }


}
