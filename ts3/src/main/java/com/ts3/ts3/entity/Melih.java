package com.ts3.ts3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "melih")
public class Melih {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
}
