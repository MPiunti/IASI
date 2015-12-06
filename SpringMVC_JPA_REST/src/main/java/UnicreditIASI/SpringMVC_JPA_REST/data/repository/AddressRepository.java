package UnicreditIASI.SpringMVC_JPA_REST.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import UnicreditIASI.SpringMVC_JPA_REST.data.model.Address;


public interface AddressRepository extends JpaRepository<Address, Long> {
		
    Optional<Address> findByStreetNameAndCityName(String streetName, String cityName );
    Address findById(int id );
}	