package com.pmm.papotecar.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    final static String FIND_BY_RIDE = "SELECT u. " + "FROM UserEntity as u INNER JOIN pool on user.id=pool.user_id "
	    + "WHERE pool.ride_id=:rideId";

    UserEntity findOneByUserId(long userId);

    // @Query(FIND_BY_RIDE)
    // public List<UserEntity> findByRideId(@Param("rideId") long rideId);

}
