package applicazione.model;

public class Token {

	public Integer id;
	public String token;
	public TokenType tokenType = TokenType.BEARER;
	public boolean revoked;
	public boolean expired;
	public User user;

	/**
	 * @param id
	 * @param token
	 * @param tokenType
	 * @param revoked
	 * @param expired
	 * @param user
	 */
	public Token(Integer id, User user, String token, TokenType tokenType, boolean revoked, boolean expired) {
		super();
		this.id = id;
		this.user = user;
		this.token = token;
		this.tokenType = tokenType;
		this.revoked = revoked;
		this.expired = expired;

	}
	
	/**
	 * 
	 */
	public Token() {
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the tokenType
	 */
	public TokenType getTokenType() {
		return tokenType;
	}

	/**
	 * @param tokenType the tokenType to set
	 */
	public void setTokenType(TokenType tokenType) {
		this.tokenType = tokenType;
	}

	/**
	 * @return the revoked
	 */
	public boolean isRevoked() {
		return revoked;
	}

	/**
	 * @param revoked the revoked to set
	 */
	public void setRevoked(boolean revoked) {
		this.revoked = revoked;
	}

	/**
	 * @return the expired
	 */
	public boolean isExpired() {
		return expired;
	}

	/**
	 * @param expired the expired to set
	 */
	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
