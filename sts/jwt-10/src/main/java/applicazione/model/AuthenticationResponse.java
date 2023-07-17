package applicazione.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthenticationResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;

	@JsonProperty("access_token")
	private String accessToken;
	@JsonProperty("refresh_token")
	private String refreshToken;


	/**
	 * 
	 */
	public AuthenticationResponse() {
	}

	/**
	 * @param accessToken
	 * @param refreshToken
	 */
	public AuthenticationResponse(String accessToken, String refreshToken) {
		super();
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
	}

	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @return the refreshToken
	 */
	public String getRefreshToken() {
		return refreshToken;
	}

	/**
	 * @param refreshToken the refreshToken to set
	 */
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
}