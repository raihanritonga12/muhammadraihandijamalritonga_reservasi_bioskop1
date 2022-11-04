package com.binarchallenge4.demo.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.DateTimeException;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name= "reservation")
public class ReservesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservasi")
    private long id_reservasi;
    @Column(name = "harga")
    private long harga;
    @Column(name = "kode_kursi")
    private String kode_kursi;
    @Column(name = "jadwal_id")
    private String jadwal_id;
    @Column(name = "cinema_id")
    private String cinema_id;
}
