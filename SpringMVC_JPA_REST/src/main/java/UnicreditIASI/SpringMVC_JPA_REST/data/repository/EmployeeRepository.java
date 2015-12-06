package UnicreditIASI.SpringMVC_JPA_REST.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import UnicreditIASI.SpringMVC_JPA_REST.data.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //Optional<Employee> findByStreetNAmeAndCityName(String streetName, String cityName );
    
    Employee findById(Long id );
}