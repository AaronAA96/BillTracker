package aaron.bill.tracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	
	private User(String username, String email, String password)
	{
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	public static User newUser(String username, String email, String password)
	{
		return new User(username, email, password);
	}
	
	public Long getId()
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
	
	public void setPassword(String newPassword)
	{
		this.password = newPassword;
	}
	
}
