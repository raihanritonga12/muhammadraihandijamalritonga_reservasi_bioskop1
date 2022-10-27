package com.binarchallenge4.demo.Controller;

import com.binarchallenge4.demo.Entity.ContohEntity;
import com.binarchallenge4.demo.service.ContohService;
import com.lowagie.text.DocumentException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@Slf4j
@RestController
@RequestMapping("/Contoh")
@Service
public class ContohController {

    @Autowired
    private ContohService contohService;

    @Operation(summary="Membuat laporan dalam bentuk PDF")
    @ApiResponses(value ={
            @ApiResponse(responseCode = "200",
                    description = "mengoutputkan data",
                    content = {@Content(mediaType="application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "tidak bisa",
                    content = @Content)
    }
    )
    @GetMapping("/PDF")
    public ResponseEntity<?> Jasper(@RequestParam(required = false,value = "namafile") String namafile) throws IOException, DocumentException {
        try {
            ContohEntity file = contohService.generateLaporan(namafile);
            System.out.println(file + " sudah di outputkan");
            return ResponseEntity.ok().contentType(MediaType.parseMediaType(file.getTipeDataFile()))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename\"" + namafile + "\"")
                    .body(new ByteArrayResource(file.getData()));
        } catch (JRException e) {
            System.out.println("file menghilang : " + e.getMessage());
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
}
