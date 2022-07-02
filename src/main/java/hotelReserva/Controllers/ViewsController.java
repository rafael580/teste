package hotelReserva.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin("*")
public class ViewsController {

	
	@RequestMapping({"/", "welcome"})
	public String index() {
		return "index";
	}

	@RequestMapping("/signup")
	public String signUp() {
		return "signUp";
	}

	@RequestMapping("/adminlogin")
	public String Admin() {
		return "Admin";
	}

	@RequestMapping("/bookingdetails")
	public String AdminLogin() {
		return "AdminLogin";
	}

	@RequestMapping("/customerdetails")
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

	@RequestMapping("/userlogin")
	public String userLogin() {
		return "userLogin";
	}
	
}
