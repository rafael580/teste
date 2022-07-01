package hotelReserva.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotelReserva.DTO.CustomerDTO;
import hotelReserva.DTO.RoomDTO;
import hotelReserva.entity.Admin;
import hotelReserva.entity.Customer;
import hotelReserva.entity.Room;
import hotelReserva.repository.AdminRepository;
import hotelReserva.repository.CustomerRepository;
import hotelReserva.repository.RoomRepository;

@Service
public class AdminService {

	@Autowired

	private RoomRepository roomRepository;
	
	@Autowired

	private CustomerRepository repository;
	
	@Autowired
	
	private AdminRepository adm;
	
	
	public Admin login(String pass,String user) {
		
		Admin ad = adm.findUserByUsernameAndPassword(user, pass);
		if(ad!=null) {
			return ad;
		}
		return null;
	}
	

	public List<RoomDTO> todosOsQuartos() {
		List<Room> obj = roomRepository.findAll();
		ArrayList<RoomDTO> list = new ArrayList<>();
		for (Room x : obj) {
			list.add(new RoomDTO(x));
		}
		return list;
	}

	public CustomerDTO cliente(Long id) {
		Optional<Room> obj = roomRepository.findById(id);
		Room room = obj.orElse(null);
		return new CustomerDTO(room.getCustomer());
	}

}
