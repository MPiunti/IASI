package UnicreditIASI.SpringMVC_JPA_REST.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UnicreditIASI.SpringMVC_JPA_REST.data.model.Address;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public interface AddressRepository extends JpaRepository<Address, Long> {
		
    Optional<Address> findByStreetNameAndCityName(String streetName, String cityName );
    Address findById(int id );
}