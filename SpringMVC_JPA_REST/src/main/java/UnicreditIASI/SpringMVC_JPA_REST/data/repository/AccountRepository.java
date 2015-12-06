package UnicreditIASI.SpringMVC_JPA_REST.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import UnicreditIASI.SpringMVC_JPA_REST.account.Account;


/**
 * this Spring Data Interface is used instead of Account Repository. 
 * Notice implementation is implicit, no need to define methods body
 * even in presence of new findByXXX methods: 
 * Spring Data is capable to shape methods dynamically, 
 * this build the query based on the Account data model
 *
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
	
	Account findByEmail(String email );

}
