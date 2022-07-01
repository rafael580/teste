package hotelReserva.DTO;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import hotelReserva.entity.Customer;
import hotelReserva.entity.Room;
import hotelReserva.entity.enums.TypeOfRoomQuarto;

public class RoomDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer extraBeds;
	private Instant fromDate;
	private Instant toDate;
	private double price;
	private TypeOfRoomQuarto roomType;
	
	private Customer customer;
	
	public RoomDTO() {}
	
	public RoomDTO(Room r) {

		this.extraBeds = r.getExtraBeds();
		this.fromDate = r.getFromDate();
		this.toDate = r.getToDate();
		this.price = r.getPrice();
		this.roomType = r.getRoomType();
		this.customer = r.getCustomer();
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
}
