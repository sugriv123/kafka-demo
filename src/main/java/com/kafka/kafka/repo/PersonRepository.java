package com.kafka.kafka.repo;

import com.kafka.kafka.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

    public Optional<Person> findById(Integer id);

}
