package hotelReserva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotelReserva.DTO.CustomerDTO;
import hotelReserva.DTO.RoomDTO;
import hotelReserva.entity.Customer;
import hotelReserva.entity.Room;
import hotelReserva.entity.enums.TypeOfRoomQuarto;
import hotelReserva.repository.AdminRepository;
import hotelReserva.repository.CustomerRepository;
import hotelReserva.repository.RoomRepository;
@Service
public class CustomerService {

	@Autowired

	private CustomerRepository repository;
	
	@Autowired
	
	private RoomRepository roomRepository;
	
	@Autowired
	
	private AdminRepository admin;

	public List<Customer> achar() {
		return repository.findAll();
	}
	
	
	public Customer loginOnPage(String email,String password) {
		Customer customer = repository.findUserByUsernameAndPassword(email, password);
		return customer;
	}
	
	public CustomerDTO createCustomer(Customer c) {
		Customer obj = repository.save(c);
		return new CustomerDTO(obj);
	}
	
	public RoomDTO createRoomPrimierSuite(Long id,Room r) {
		Customer c = repository.getOne(id);
		r.setCustomer(c);
		r.setRoomType(TypeOfRoomQuarto.PremierSuite);
		
		Room room = roomRepository.save(r);
		return new RoomDTO(room);
	}
	public RoomDTO createRoomDeluxe(Long id,Room r) {
		Customer c = repository.getOne(id);
		r.setCustomer(c);
		r.setRoomType(TypeOfRoomQuarto.DeluxeAC);
		Room room = roomRepository.save(r);
		return new RoomDTO(room);
	}
	public RoomDTO createRoomDeluxeNonAC(Long id,Room r) {
		Customer c = repository.getOne(id);
		r.setCustomer(c);
		r.setRoomType(TypeOfRoomQuarto.DeluxeNonAC);
		Room room = roomRepository.save(r);
		return new RoomDTO(room);
	}

}
