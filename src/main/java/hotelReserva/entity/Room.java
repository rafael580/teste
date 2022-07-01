package hotelReserva.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import hotelReserva.entity.enums.TypeOfRoomQuarto;

@Entity
@Table(name = "table_room")
public class Room implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer extraBeds;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "GMT-3")
	private Instant fromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy",  timezone = "GMT-3")
	private Instant toDate;
	private double price;
	
	@Enumerated(EnumType.ORDINAL)
	private TypeOfRoomQuarto  roomType;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "custumer_id")
	private Customer customer;

	public Room() {
	}

	public Room(Integer extraBeds, Instant fromDate, Instant toDate, double price, TypeOfRoomQuarto  roomType, Customer customer) {
		super();
		this.extraBeds = extraBeds;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.price = price;
		this.roomType = roomType;
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public Integer getExtraBeds() {
		return extraBeds;
	}

	public void setExtraBeds(Integer extraBeds) {
		this.extraBeds = extraBeds;
	}

	public Instant getFromDate() {
		return fromDate;
	}

	public void setFromDate(Instant fromDate) {
		this.fromDate = fromDate;
	}

	public Instant getToDate() {
		return toDate;
	}

	public void setToDate(Instant toDate) {
		this.toDate = toDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public TypeOfRoomQuarto getRoomType() {
		return roomType;
	}

	public void setRoomType(TypeOfRoomQuarto roomType) {
		this.roomType = roomType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		Room other = (Room) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", extraBeds=" + extraBeds + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", price=" + price + ", roomType=" + roomType + ", customer=" + customer + "]";
	}

	
	
}
