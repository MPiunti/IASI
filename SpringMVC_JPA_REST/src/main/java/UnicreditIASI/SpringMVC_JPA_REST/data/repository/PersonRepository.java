package UnicreditIASI.SpringMVC_JPA_REST.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UnicreditIASI.SpringMVC_JPA_REST.data.model.Person;

import java.util.Optional;


public interface PersonRepository extends JpaRepository<Person, Long> {
    //Optional<Person> findByLastNameAndStreetname(String lastName, String streetName );
}