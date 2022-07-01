package hotelReserva.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hotelReserva.DTO.CustomerDTO;
import hotelReserva.DTO.RoomDTO;
import hotelReserva.entity.Customer;
import hotelReserva.entity.Room;
import hotelReserva.repository.CustomerRepository;
import hotelReserva.service.CustomerService;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class CustomerController {

	@Autowired

	private CustomerService repository;


	@RequestMapping(value = "/singUp/salvar", method = RequestMethod.POST, headers = "Accept=application/json")

	public ResponseEntity<CustomerDTO> createNewCustomer(@RequestBody Customer customer) {
		System.out.println(customer.toString());
		return ResponseEntity.ok().body(repository.createCustomer(customer));
	}
	@RequestMapping(value = "/pegarUser", method = RequestMethod.GET, headers = "Accept=application/json")
	
	public ResponseEntity<List<Customer>> usuruari(){
		List<Customer> c =  repository.achar();
		return ResponseEntity.ok().body(c);
	}
	
	
	@RequestMapping(value = "/criarRoomPremier", method = RequestMethod.POST, headers = "Accept=application/json")

	public ResponseEntity<RoomDTO> createRoomPremierSuite(@RequestBody Room room) {
		return null;
	}

	@RequestMapping(value = "/criarDeluxeNonAC", method = RequestMethod.POST, headers = "Accept=application/json")

	public ResponseEntity<RoomDTO> createDeluxeNonAC(@RequestBody Room room) {
		return null;
	}
	
	@RequestMapping(value = "/criarDeluxeAC", method = RequestMethod.POST, headers = "Accept=application/json")

	public ResponseEntity<RoomDTO> createDeluxeAC(@RequestBody Room room) {
		return null;
	}

}