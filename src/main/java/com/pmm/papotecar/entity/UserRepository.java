package com.pmm.papotecar.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    final static String FIND_BY_RIDE = "SELECT * " + "FROM user INNER JOIN pool on user.id=pool.user_id "
	    + "WHERE pool.ride_id=:rideId";

    UserEntity findOneByUserId(long userId);

    @Query(FIND_BY_RIDE)
    public List<UserEntity> findByRideId(@Param("rideId") long rideId);

}
