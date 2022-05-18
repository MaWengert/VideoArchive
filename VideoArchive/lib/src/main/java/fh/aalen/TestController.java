package fh.aalen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController



public class TestController {
	
	@RequestMapping("/")
	public String sayHello() {		
		return "Hallo Leute!";
	}
	
	@RequestMapping("bye")
	public String sayBye() {		
		return "Adios!";
	}
	
	@RequestMapping("goodnigth")
	public String sayGoodNigth() {		
		return "Schlaf gut!";
	}
	
	

}
