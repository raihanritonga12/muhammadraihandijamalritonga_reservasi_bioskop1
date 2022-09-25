//package com.Binar.Challenge4.entity;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//
//@Getter
//@Setter
//@Entity
//@Table(name= "nt_film")
//
//public class FilmEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "Film_Code")
//    private long nt_code;
//    @Column(name = "Film Name")
//    private String film_name;
//    @Column(name = "Film Status")
//    private String film_status;
//    @Column(name = "Duration")
//    private String film_duration;
//    @Column(name = "genre")
//    private String genre;
//}
package com.binarchallenge4.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name= "tabel_film")

public class FilmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kode_film")
    private long kode_film;
    @Column(name = "nama_film")
    private String nama_film;
    @Column(name = "film_status")
    private String status_film;
    @Column(name = "lama")
    private String durasi;
    @Column(name = "genre")
    private String genre;

}
