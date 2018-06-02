package com.pmm.papotecar.entity;

import java.util.Date;

import javax.persistence.Column;
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
    @Column(name = "id_user")
    private long userId;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private Date birthdate;
    private String gender;
}
