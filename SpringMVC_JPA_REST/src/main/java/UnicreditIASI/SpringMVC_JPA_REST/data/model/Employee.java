package UnicreditIASI.SpringMVC_JPA_REST.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table( name = "EMPLOYEE" )
/*@NamedQuery(name = "Employee.getAvgSalary",
query = "SELECT avg(e.salary) FROM Employee e")
@NamedNativeQuery(name = "Employee.livesInRM", 
query = "SELECT p.last_name FROM EMPLOYEE e, PERSON p, ADDRESS a WHERE e.person_id = p.person_id AND "
		+ "p.address_address_id = a.address_id AND a.state_name = 'RM'")*/
public class Employee extends Person {
	private int salary;

	public Employee() {
		
	}
	
	public Employee(String fname, String lname, Address address, int salary) {
		super(fname, lname, address);
		this.salary = salary;
	}
	
	@Column(name = "salary")
	public int getSalary() {
		return salary;
	}
	
	public void setSalary( int salary ) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s - Monthly salary: $%d\nAddress: %s", this.getLastName(), this.getFirstName(), salary, getAddress());
	}
}