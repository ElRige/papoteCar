package com.pmm.papotecar.entity;

import java.util.Date;

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
    private int messageId;
    private int userId;
    private int rideId;
    private String content;
    private Date dateMessage;
}
