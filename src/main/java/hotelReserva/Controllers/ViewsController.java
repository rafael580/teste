package hotelReserva.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin("*")
public class ViewsController {

	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/signUp")
	public String signUp() {
		return "signUp";
	}

	@RequestMapping("/Admin")
	public String Admin() {
		return "Admin";
	}

	@RequestMapping("/AdminLogin")
	public String AdminLogin() {
		return "AdminLogin";
	}

	@RequestMapping("/CustomerDetails")
	public String CustomerDetails() {
		return "CustomerDetails";
	}

	@RequestMapping("/DeluxeAC")
	public String DeluxeAC() {
		return "DeluxeAC";
	}

	@RequestMapping("/DeluxeNonAC")
	public String DeluxeNonAC() {
		return "DeluxeNonAC";
	}

	@RequestMapping("/PremierSuite")
	public String PremierSuite() {
		return "PremierSuite";
	}

	@RequestMapping("/userLogin")
	public String userLogin() {
		return "userLogin";
	}
	
}
