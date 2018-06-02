package com.pmm.papotecar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pmm.papotecar.entity.RideEntity;
import com.pmm.papotecar.entity.RideRepository;

@Service
public class RideService {

    private RideRepository rideRepository;
    private UserService userService;

    public RideService(RideRepository rideRepository, UserService userService) {
	this.rideRepository = rideRepository;
	this.userService = userService;
    }

    public List<Ride> getRidesByDriver(User driver) {

	List<RideEntity> rideEntities = rideRepository.findByDriverId(driver.getId());

	return map(rideEntities, driver);

    }

    public Ride getRide(long rideId) {
	return map(rideRepository.getOne(rideId));
    }

    public Ride createRide(Ride ride) {
	// TODO createRide
	return null;
    }

    public Ride updateRide(Ride ride) {
	// TODO updateRide
	return null;
    }

    public void deleteRide(long rideId) {
	// TODO deleteRide
    }

    private List<Ride> map(List<RideEntity> rideEntities, User driver) {
	List<Ride> rides = new ArrayList<>();
	for (RideEntity rideEntity : rideEntities) {
	    rides.add(map(rideEntity, driver));
	}
	return rides;
    }

    private Ride map(RideEntity rideEntity) {

	User driver = userService.getUser(rideEntity.getDriverId());
	return map(rideEntity, driver);
    }

    private Ride map(RideEntity rideEntity, User driver) {

	List<User> carpoolers = userService.map(rideEntity.getCarpoolers());
	return new Ride(rideEntity.getRideId(), rideEntity.getState(), rideEntity.getDescription(),
		rideEntity.getSeatingCapacity(), rideEntity.getPrice(), driver, carpoolers);
    }

}
