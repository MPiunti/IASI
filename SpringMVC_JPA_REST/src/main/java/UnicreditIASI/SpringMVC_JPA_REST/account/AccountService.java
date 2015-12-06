package UnicreditIASI.SpringMVC_JPA_REST.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import UnicreditIASI.SpringMVC_JPA_REST.data.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder; 
	
	
	
	public Account findByEmail(String email ){
		return accountRepository.findByEmail(email);		
	}
	
	
	/**
	 * Password is encoded before being persisted
	 * @param account
	 * @return
	 */
	public Account save(Account account) {
		account.setPassword(passwordEncoder.encode(account.getPassword()));
		try{
			accountRepository.save(account);
		} catch(Exception e){
			e.printStackTrace();
		}
		return account;
	}

}
