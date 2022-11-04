package com.binarchallenge4.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "seat")
public class SeatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kode_kursi")
    private long kode_kursi;
    @Column(name = "nomor_kursi")
    private String nomor_kursi;
    @Column(name = "cinema_id")
    private String cinema_id;

}
