package com.binarchallenge4.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "schedule")
public class ScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jadwal_id")
    private long jadwal_id;
    @Column(name = "kode_film")
    private String kode_film;
    @Column(name = "tanggal_rilis")
    private String tanggal_rilis;
    @Column(name = "jam_mulai")
    private String jam_mulai;
    @Column(name = "jam_akhir")
    private String jam_akhir;
    @Column(name = "harga_tiket")
    private String harga_tiket;


}
