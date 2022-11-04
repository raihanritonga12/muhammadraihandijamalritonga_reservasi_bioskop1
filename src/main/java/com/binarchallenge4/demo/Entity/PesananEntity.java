package com.binarchallenge4.demo.Entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name= "booking")
public class PesananEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pesanan")
    private long id_pesanan;
    @Column(name = "jumlah_kursi")
    private String jumlah_kursi;
    @Column(name = "kode_kursi")
    private String kode_kursi;
    @Column(name = "cinema_id")
    private String cinema_id;
}
