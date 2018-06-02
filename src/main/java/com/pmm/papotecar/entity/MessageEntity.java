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
    private long messageId;
    private long userId;
    private long rideId;
    private String content;
    private Date dateMessage;
}
