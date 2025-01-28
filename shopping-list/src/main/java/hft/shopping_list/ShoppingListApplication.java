package hft.shopping_list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class ShoppingListApplication {

	@GetMapping("/hello")
	public String sayHello(){
		return "hello, hft";
	}

	@GetMapping("/hello/{name}")
	public String sayHellowWithParameter(@PathVariable String name){
		return "hello, " + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoppingListApplication.class, args);
	}

}
