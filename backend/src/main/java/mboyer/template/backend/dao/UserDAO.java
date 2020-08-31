package mboyer.template.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mboyer.template.backend.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
	
}
