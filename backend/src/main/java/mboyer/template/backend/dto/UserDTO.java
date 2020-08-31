package mboyer.template.backend.dto;

import mboyer.template.backend.model.User;

public class UserDTO {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public static UserDTO build(User u) {
		UserDTO dto = new UserDTO();
		
		if (u.getUsername() != null) { dto.setUsername(u.getUsername()); }
		
		return dto;
	}
}
