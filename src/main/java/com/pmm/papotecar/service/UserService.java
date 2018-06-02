package com.pmm.papotecar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pmm.papotecar.entity.UserEntity;
import com.pmm.papotecar.entity.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
	this.userRepository = userRepository;
    }

    public User getUser(Long userId) {

	Optional<UserEntity> userEntity = userRepository.findById(userId);
	return map(userEntity.get());
    }

    public User createUser(User user) {
	// TODO createUser
	return null;
    }

    public User updateUser(User user) {
	// TODO updateUser
	return null;
    }

    public void deleteUser(long userId) {
	// TODO deleteUser
    }

    public List<User> getUsersByRideId(Long rideId) {

	// List<UserEntity> userEntities = userRepository.findByRideId(rideId);
	// return map(userEntities);
	return null;
    }

    List<User> map(List<UserEntity> userEntities) {
	List<User> users = new ArrayList<>();
	for (UserEntity userEntity : userEntities) {
	    users.add(map(userEntity));

	}
	return users;
    }

    private User map(UserEntity userEntity) {

	return new User(userEntity.getUserId(), userEntity.getEmail(), null, userEntity.getFirstname(),
		userEntity.getLastname(), userEntity.getBirthdate(), userEntity.getGender());
    }
}
