package aaron.bill.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import aaron.bill.tracker.model.User;

@SpringBootApplication
public class BillTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillTrackerApplication.class, args);
		
		User user = User.newUser("Aaron", "aaronellis1@hotmail.co.uk", "stopmenow");
			
		System.out.print(user.getUsername());
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/login").allowedOrigins("http://localhost:3000");
			}
		};
	}

}
