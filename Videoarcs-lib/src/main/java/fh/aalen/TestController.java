package fh.aalen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	public String sayHello() {
		return "Hello"; 
	}
	
	@RequestMapping("/bye")
	public String sayBye() {
		return "Good Bye";
	}

	@RequestMapping("/goodnight")
	public String sayGoodNight() {
		return "Good Night!"; 
	}
}

