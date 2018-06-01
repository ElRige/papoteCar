package com.pmm.papotecar.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {

    List<MessageEntity> findByUserIdAndRideId(int userId, int rideId);
}
