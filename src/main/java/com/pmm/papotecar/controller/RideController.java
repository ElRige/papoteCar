package com.pmm.papotecar.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmm.papotecar.service.Ride;
import com.pmm.papotecar.service.RideService;
import com.pmm.papotecar.service.User;

@RestController
@RequestMapping("/rides")
public class RideController {

    private RideService rideService;

    public RideController(RideService rideService) {
	this.rideService = rideService;
    }

    @GetMapping
    List<Ride> getRides() {

	User driver = new User(1, "pierre@gmail.com", "Pierre", "Conord", "date", "gender");

	return rideService.getRideByDriver(driver);
    }

    @GetMapping
    @RequestMapping(value = "/{rideId}")
    List<Ride> getRide(@PathVariable String rideId) {

	return null;// rideService.getRideByDriver(driver);
    }
}
