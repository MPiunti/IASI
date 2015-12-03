package UnicreditIASI.SpringMVC_JPA_REST.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "ADDRESS" )
public class Address {
	private int id;
	private String streetName;
	private String cityName;
	private String zipCode;
	private String stateName;
	
	public Address() {
		
	}
	
    public Address(String sid) {
	   this.id=Integer.parseInt(sid);
	}
	

	public Address(String streetName, String cityName, String zipCode, String stateName) {
		this.streetName = streetName;
		this.cityName = cityName;
		this.zipCode = zipCode;
		this.stateName = stateName;
	}

	@Id
	@GeneratedValue  
	@Column(name = "address_id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "street_name")
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@Column(name = "city_name")
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Column(name = "zip_code")
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Column(name = "state_name")
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return String.format("id:%s, streetName:%s, cityName:%s, stateName:%s (%s)", id, streetName, cityName, stateName,
				zipCode);
	}
	
	
}
