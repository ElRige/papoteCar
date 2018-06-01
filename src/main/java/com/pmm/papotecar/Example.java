package com.pmm.papotecar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "example")
public class Example {

    @Id
    @GeneratedValue
    private int id;
    private String first;
    private String last;

}
