package mboyer.template.backend.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mboyer.template.backend.dao.UserDAO;
import mboyer.template.backend.dto.UserDTO;
import mboyer.template.backend.model.User;
import mboyer.template.backend.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	
	@Override
	public UserDTO getUser(Long id) {
		final Optional<User> user = userDao.findById(id);
		
		return (user.isPresent()) ? UserDTO.build(user.get()) : null; 
	}
}
