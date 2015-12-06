package UnicreditIASI.SpringMVC_JPA_REST.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import UnicreditIASI.SpringMVC_JPA_REST.data.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {
    //Optional<Person> findByLastNameAndStreetname(String lastName, String streetName );
}