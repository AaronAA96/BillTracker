package aaron.bill.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import aaron.bill.tracker.model.User;

@SpringBootApplication
public class BillTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillTrackerApplication.class, args);
		
		User user = new User();
		
		user.setUsername("Aaron's new user");
		
		System.out.print(user.getUsername());
	}

}
