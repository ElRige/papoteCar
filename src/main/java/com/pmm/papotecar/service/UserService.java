package com.pmm.papotecar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.pmm.papotecar.entity.UserEntity;
import com.pmm.papotecar.entity.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
	this.userRepository = userRepository;
    }

    public User getUserById(Long userId) {

	Optional<UserEntity> userEntity = userRepository.findById(userId);
	return map(userEntity.get());
    }

    public List<User> getUserByRideId(Long rideId) {

	List<UserEntity> userEntities = userRepository.findByRideId(rideId);
	return map(userEntities);
    }

    private List<User> map(List<UserEntity> userEntities) {
	List<User> users = new ArrayList<>();
	for (UserEntity userEntity : userEntities) {
	    users.add(map(userEntity));

	}
	return users;
    }

    private User map(UserEntity userEntity) {

	return new User(userEntity.getId(), userEntity.getEmail(), userEntity.getFirstname(), userEntity.getLastname(),
		userEntity.getBirthdate(), userEntity.getGender());
    }
}
