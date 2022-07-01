package hotelReserva.DTO;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import hotelReserva.entity.Customer;
import hotelReserva.entity.enums.ProofTypeCustomer;

public class CustomerDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String email;
	private String password;
	private Instant dateOFBirth;
	private String phoneNumber;
	private ProofTypeCustomer idProofType;
	private String idProofNumer;

	public CustomerDTO(Customer c) {
		
		this.name = c.getName();
		this.email = c.getEmail();
		this.password = c.getPassword();
		this.dateOFBirth = c.getDateOFBirth();
		this.phoneNumber = c.getPhoneNumber();
		this.idProofType = c.getIdProofType();
		this.idProofNumer = c.getIdProofNumer();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Instant getDateOFBirth() {
		return dateOFBirth;
	}

	public void setDateOFBirth(Instant dateOFBirth) {
		this.dateOFBirth = dateOFBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ProofTypeCustomer getIdProofType() {
		return idProofType;
	}

	public void setIdProofType(ProofTypeCustomer idProofType) {
		this.idProofType = idProofType;
	}

	public String getIdProofNumer() {
		return idProofNumer;
	}

	public void setIdProofNumer(String idProofNumer) {
		this.idProofNumer = idProofNumer;
	}
}
