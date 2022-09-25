package com.binarchallenge4.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "nt_Studio")
public class CinemaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cinema_id")
    private long cinema_id;
    @Column(name = "nama_cinema")
    private String nama_cinema;
}
