package p1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	

	@GetMapping("/")
	public String Home() {
		System.out.println("Hello I am Spring Boot app deploy on Jenkins Server");
		System.out.println("I am change through GitHub");
		System.out.println("my name is yaseen khan");
		
		return "home";
	}

}
