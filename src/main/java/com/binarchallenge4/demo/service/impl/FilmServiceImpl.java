package com.binarchallenge4.demo.service.impl;

import com.binarchallenge4.demo.Entity.FilmEntity;
import com.binarchallenge4.demo.repository.FilmRepository;
import com.binarchallenge4.demo.service.FilmService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;


    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    @Override
    public List<FilmEntity> cariSemuaFilm() {
        return filmRepository.findAll();
    }

    @Override
    public Optional<FilmEntity> CariDariID(Long user_id) {
        return filmRepository.findById(user_id);
    }

    @Override
    public FilmEntity simpanFilm(FilmEntity filmEntity) {
        return filmRepository.save(filmEntity);
    }

    @Override
    public FilmEntity updateFilm(Long id, FilmEntity filmEntity) {
        FilmEntity FilmEntityUpdate=filmRepository.findById(id).get();
        FilmEntityUpdate.setNama_film(filmEntity.getNama_film());
        FilmEntityUpdate.setStatus_film(filmEntity.getStatus_film());
        FilmEntityUpdate.setDurasi(filmEntity.getDurasi());
        FilmEntityUpdate.setGenre(filmEntity.getGenre());
        return filmRepository.save(FilmEntityUpdate);
    }
    public String deleteFilm(Long id) {
        filmRepository.deleteById(id);
        return "Film Has Been Deleted";
    }
}
