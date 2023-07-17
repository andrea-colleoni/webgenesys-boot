package applicazione.model;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	private String email;
	String password;
	
	//need default constructor for JSON Parsing
	public AuthenticationRequest()
	{
		
	}

	public AuthenticationRequest(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
