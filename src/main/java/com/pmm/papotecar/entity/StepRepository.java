package com.pmm.papotecar.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StepRepository extends JpaRepository<StepEntity, Long> {

    List<StepEntity> findOneByRideId(int rideId);
}
