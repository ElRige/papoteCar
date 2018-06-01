package com.pmm.papotecar.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Long> {

    List<CarEntity> findByCarId(int carId);
}
