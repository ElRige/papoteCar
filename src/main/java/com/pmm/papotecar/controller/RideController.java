package com.pmm.papotecar.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pmm.papotecar.service.Ride;
import com.pmm.papotecar.service.RideService;

@RestController
@RequestMapping(value = "/rides")
public class RideController {

    private RideService rideService;

    public RideController(RideService rideService) {
	this.rideService = rideService;
    }

    @GetMapping
    List<Ride> getRides() {

	return rideService.getRides();
    }

    @RequestMapping(value = "/{rideId}", method = RequestMethod.GET)
    Ride getRide(@PathVariable long rideId) {

	return rideService.getRide(rideId);
    }

    @RequestMapping(value = "/{rideId}", method = RequestMethod.POST)
    Ride createRide(@PathVariable long rideId, @RequestParam(value = "ride") Ride ride) {

	return rideService.createRide(ride);
    }

    @RequestMapping(value = "/{rideId}", method = RequestMethod.PUT)
    Ride updateRide(@RequestParam(value = "ride") Ride ride) {

	return rideService.updateRide(ride);
    }

    @RequestMapping(value = "/{rideId}", method = RequestMethod.DELETE)
    void deleteRide(@PathVariable long rideId) {

	rideService.deleteRide(rideId);
    }

}
