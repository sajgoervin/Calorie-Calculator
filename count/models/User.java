package models;

public class User {

	private Long userId;
	private String username;
	private String password;
	private Boolean isAdmin;
	
	
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}	
	
}
