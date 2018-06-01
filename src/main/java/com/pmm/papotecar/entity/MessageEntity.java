package com.pmm.papotecar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "message")
public class MessageEntity {

    @Id
    @GeneratedValue
    private int id;
    private int userId;
    private int rideId;
    private String content;
    private String dateMessage;
}
