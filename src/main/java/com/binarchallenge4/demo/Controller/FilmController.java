package com.binarchallenge4.demo.Controller;


import com.binarchallenge4.demo.Entity.FilmEntity;
import com.binarchallenge4.demo.service.FilmService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    FilmService filmService;

    @PostMapping("/buat")
    @ResponseStatus(HttpStatus.CREATED)
    public FilmEntity create(@RequestBody FilmEntity film){
        return filmService.simpanFilm(film);
    }
    @GetMapping("/ambilSemua")
    public List<FilmEntity> getall(){
        return filmService.cariSemuaFilm();
    }
    @PutMapping("/update/{id}")
    public FilmEntity update(@PathVariable Long id, @RequestBody FilmEntity film){
        return filmService.updateFilm(id,film);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return filmService.deleteFilm(id);
    }


    @GetMapping("/test")
    public String testEndpoint(){
        return "JALAN GAK KAU";
    }


}
