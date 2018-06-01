package com.pmm.papotecar.service;

import lombok.Data;

@Data
public class User {

    private int id;
    private String email;
    private String firstname;
    private String lastname;
    private String birthdate;
    private String gender;

    public User(int id, String email, String firstname, String lastname, String birthdate, String gender) {
	this.id = id;
	this.email = email;
	this.firstname = firstname;
	this.lastname = lastname;
	this.birthdate = birthdate;
	this.gender = gender;
    }

}
