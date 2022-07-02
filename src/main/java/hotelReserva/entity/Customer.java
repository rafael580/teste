package hotelReserva.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import hotelReserva.entity.enums.ProofTypeCustomer;

@Entity
@Table(name = "table_custumer")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String email;
	private String password;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "GMT-3")
	private Date dateOFBirth;
	private String phoneNumber;
	
	@Enumerated(EnumType.ORDINAL)
	private ProofTypeCustomer idProofType;
	private String idProofNumer;

	public Customer() {

	}

	public Customer(String name, String email, String password, Date dateOFBirth, String phoneNumber,
			ProofTypeCustomer idProofType, String idProofNumer) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOFBirth = dateOFBirth;
		this.phoneNumber = phoneNumber;
		this.idProofType = idProofType;
		this.idProofNumer = idProofNumer;
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

	public Date getDateOFBirth() {
		return dateOFBirth;
	}

	public void setDateOFBirth(Date dateOFBirth) {
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", dateOFBirth=" + dateOFBirth + ", phoneNumber=" + phoneNumber + ", idProofType=" + idProofType
				+ ", idProofNumer=" + idProofNumer + "]";
	}



}
