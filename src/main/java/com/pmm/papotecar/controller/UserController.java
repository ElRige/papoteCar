package com.pmm.papotecar.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pmm.papotecar.service.User;
import com.pmm.papotecar.service.UserService;

@RestController
@RequestMapping(value = "/users", produces = "application/json", consumes = "application/json")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
	this.userService = userService;
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    User getRide(@PathVariable long rideId) {

	return userService.getUser(rideId);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.POST)
    User createRide(@PathVariable long rideId, @RequestParam(value = "ride") User user) {

	return userService.createUser(user);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.PUT)
    User updateRide(@RequestParam(value = "ride") User user) {

	return userService.updateUser(user);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    void deleteRide(@PathVariable long rideId) {

	userService.deleteUser(rideId);
    }

}
