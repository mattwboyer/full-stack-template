package mboyer.template.backend.service;

import mboyer.template.backend.dto.UserDTO;

public interface UserService {
	UserDTO getUser(Long id);
}
