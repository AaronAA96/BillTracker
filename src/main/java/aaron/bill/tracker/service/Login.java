package aaron.bill.tracker.service;

public class Login {

	private final String token;
	
	public Login(String token) 
	{
		this.token = token;
	
	}
	
	public String getToken() 
	{
		return token;
	}
}
