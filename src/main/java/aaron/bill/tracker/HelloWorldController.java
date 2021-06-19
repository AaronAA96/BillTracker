package aaron.bill.tracker;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import aaron.bill.tracker.service.Greeting;

@RestController
public class HelloWorldController {

	  private static final String template = "Hello, %s!";
	  private final AtomicLong counter = new AtomicLong();

	  @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
	  @ResponseBody
	  public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
	    return new Greeting(counter.incrementAndGet(), String.format(template, name));
	  }
}
