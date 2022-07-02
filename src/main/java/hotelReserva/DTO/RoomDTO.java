package hotelReserva.DTO;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import hotelReserva.entity.Customer;
import hotelReserva.entity.Room;
import hotelReserva.entity.enums.TypeOfRoomQuarto;

public class RoomDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer extraBeds;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "GMT-3")
	private Date fromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "GMT-3")
	private Date toDate;
	private double price;
	private TypeOfRoomQuarto roomType;
	
	private Customer customer;
	
	public RoomDTO() {}
	
	public RoomDTO(Room r) {
		this.id = r.getId();
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

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
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
