package com.pmm.papotecar.service;

import java.util.Date;

import lombok.Data;

@Data
public class User {

    private long id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private Date birthdate;
    private String gender;

    public User(long id, String email, String password, String firstname, String lastname, Date birthdate,
	    String gender) {
	this.id = id;
	this.email = email;
	this.firstname = firstname;
	this.lastname = lastname;
	this.birthdate = birthdate;
	this.gender = gender;
    }

}
