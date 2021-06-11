package aaron.bill.tracker.model;

public class User {

	
	
	private String id;
	private String username;
	private String email;
	private String password;
	
	
	public User()
	{
		
	}
	
	public String getId()
	{
		return this.id;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public void setUsername(String newUsername)
	{
		this.username = newUsername;
	}
	
	public String getEmail() 
	{
		return this.email;
	}
	
	public void setEmail(String newEmail)
	{
		this.email = newEmail;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
}
