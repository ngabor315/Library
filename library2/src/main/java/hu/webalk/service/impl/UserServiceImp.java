package hu.webalk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webalk.entity.UserEntity;
import hu.webalk.repository.UserRepository;
import hu.webalk.service.UserService;

@Service
public class UserServiceImp implements UserService {
	
	UserRepository userRepository;
	
	
	@Autowired
	public UserServiceImp(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public Iterable<UserEntity> listAllUser() {
		return userRepository.findAll();
	}

	@Override
	public void newUser(UserEntity newUser) {
		userRepository.save(newUser);

	}

	@Override
	public void deleteUser(long id) {
		userRepository.delete(id);

	}

}
