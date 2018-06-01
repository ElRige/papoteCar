package com.pmm.papotecar.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<RideEntity, Long> {

    List<RideEntity> findByDriverId(long driverId);
}
