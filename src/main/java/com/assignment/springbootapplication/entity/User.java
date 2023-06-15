package com.assignment.springbootapplication.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "userdetails")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String dob;
}
