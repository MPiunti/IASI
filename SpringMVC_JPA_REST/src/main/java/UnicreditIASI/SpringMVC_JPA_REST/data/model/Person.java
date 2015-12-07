package UnicreditIASI.SpringMVC_JPA_REST.data.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "PERSON" )
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
	private Long id;
	private String firstName; 
	private String lastName;
	private Address address;
	
	public Person(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}  
	
	public Person() {

	}
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	//@SequenceGenerator(name = "SEQ", sequenceName = "SEQ", allocationSize=1)
	//   ALTER TABLE person modify column person_id int(11) auto_increment
	@Column(name = "person_id")
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name")
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true, 
			targetEntity = Address.class, cascade = CascadeType.MERGE)
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
}
