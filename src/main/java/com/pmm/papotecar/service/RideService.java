package com.pmm.papotecar.service;

import java.util.ArrayList;
import java.util.List;

import com.pmm.papotecar.entity.RideEntity;
import com.pmm.papotecar.entity.RideRepository;

public class RideService {

    private RideRepository rideRepository;
    private UserService userService;

    public RideService(RideRepository rideRepository, UserService userService) {
	this.rideRepository = rideRepository;
	this.userService = userService;
    }

    public Ride getRide(long rideId) {
	return map(rideRepository.getOne(rideId));
    }

    public List<Ride> getRideByDriver(User driver) {

	List<RideEntity> rideEntities = rideRepository.findByDriverId(driver.getId());

	return map(rideEntities, driver);

    }

    private List<Ride> map(List<RideEntity> rideEntities, User driver) {
	List<Ride> rides = new ArrayList<>();
	for (RideEntity rideEntity : rideEntities) {
	    rides.add(map(rideEntity, driver));
	}
	return rides;
    }

    private Ride map(RideEntity rideEntity) {

	User driver = userService.getUserById(rideEntity.getDriverId());
	return map(rideEntity, driver);
    }

    private Ride map(RideEntity rideEntity, User driver) {

	List<User> pools = userService.getUserByRideId(rideEntity.getId());
	return new Ride(rideEntity.getId(), rideEntity.getState(), rideEntity.getDescription(),
		rideEntity.getSeatingCapacity(), rideEntity.getPrice(), driver, pools);
    }

}
