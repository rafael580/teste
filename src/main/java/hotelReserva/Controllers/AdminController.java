package hotelReserva.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hotelReserva.DTO.CustomerDTO;
import hotelReserva.DTO.RoomDTO;
import hotelReserva.entity.Admin;
import hotelReserva.service.AdminService;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class AdminController {
	
	@Autowired
	private AdminService repository;
	
	@RequestMapping(value = "/AdminLogin/{password}/{email}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Admin> login(@PathVariable String password,String email) {
		Admin obj = repository.login(password, email);
		return ResponseEntity.ok().body(obj);
	}
	

	@RequestMapping(value = "/todosOsQuartos", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<RoomDTO>> TodosOsQuartos() {
		List<RoomDTO> obj = repository.todosOsQuartos();
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value = "/customerId/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<CustomerDTO> cliente(@PathVariable Long id) {
		CustomerDTO obj = repository.cliente(id);
		return ResponseEntity.ok().body(obj);
	}
}
