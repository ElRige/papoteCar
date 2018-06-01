package com.pmm.papotecar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String firstname;
    private String lastname;
    private String birthdate;
    private String gender;
}
