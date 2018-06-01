package com.pmm.papotecar.service;

import java.util.Date;

import lombok.Data;

@Data
public class Message {

    private int id;
    private int rideId;
    private String firstname;
    private String content;
    private Date dateMessage;
}
