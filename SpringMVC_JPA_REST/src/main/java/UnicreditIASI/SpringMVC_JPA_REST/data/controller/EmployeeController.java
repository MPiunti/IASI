package UnicreditIASI.SpringMVC_JPA_REST.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import UnicreditIASI.SpringMVC_JPA_REST.data.model.Address;
import UnicreditIASI.SpringMVC_JPA_REST.data.model.Employee;
import UnicreditIASI.SpringMVC_JPA_REST.data.repository.AddressRepository;
import UnicreditIASI.SpringMVC_JPA_REST.data.repository.EmployeeRepository;

/* RestController allows to return response bodies in JSON
HttpMessageConverter work in both directions: incoming requests bodies are converted to Java objects, 
and Java objects are converted into HTTP response bodies.
*/
@RestController
@RequestMapping("/employee")
//@   Secured("ROLE_USER")
class EmployeeController {

	//@Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    @RequestMapping(value = "/{id}/", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Employee  getEmployee(@PathVariable("id") Long id) {
        return employeeRepository.findById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
    
    
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Employee createEmployee(@RequestBody Employee employee) {
    	
    	/*System.out.println("\n\n\\n HERE creating   ******"+employee+"\n\n\n ");
    	Address addr = addressRepository.findById(employee.getAddress().getId());
    	employee.setAddress(addr);    	*/
    	Employee emp = employeeRepository.save(employee);
    	
    	return employeeRepository.findById(emp.getId());
    }
    
    
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public Employee updateEmployee(@RequestBody Employee employee) {
    	Employee emp = employeeRepository.save(employee);
    	return employeeRepository.findById(emp.getId());
    }
    
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteEmployee(@RequestBody Employee employee) {   	
    	employeeRepository.delete(employee);
    }
    
    
}