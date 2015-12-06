package UnicreditIASI.SpringMVC_JPA_REST.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import UnicreditIASI.SpringMVC_JPA_REST.data.model.Address;
import UnicreditIASI.SpringMVC_JPA_REST.data.repository.AddressRepository;

/* RestController allows to return response bodies in JSON
HttpMessageConverter work in both directions: incoming requests bodies are converted to Java objects, 
and Java objects are converted into HTTP response bodies.
*/
@RestController 
//@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/address")
//@Secured("ROLE_USER")
class AddressController {

	//@Autowired
    private AddressRepository addressRepository;

    @Autowired
    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
    
    @RequestMapping(value = "/{id}/", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Address getAddress(@PathVariable("id") int id) {
        return addressRepository.findById(id);
    }

    @RequestMapping( method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }
    
    
    @RequestMapping( method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Address createAddress(@RequestBody Address address) {
    	Address addr = addressRepository.save(address);
    	return addressRepository.findById(addr.getId());
    }
    
    
    @RequestMapping( method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public Address updateAddress(@RequestBody Address address) {
    	Address addr = addressRepository.save(address);
    	return addressRepository.findById(addr.getId());
    }
    
    @RequestMapping( method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteAddress(Address address) {
    	addressRepository.delete(address);
    }
    
    
}