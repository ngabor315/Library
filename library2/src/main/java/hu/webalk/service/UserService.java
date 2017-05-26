package hu.webalk.service;

import hu.webalk.entity.UserEntity;

public interface UserService {
	Iterable<UserEntity> listAllUser();
	void newUser(UserEntity newUser);
	void deleteUser (long id);

}
