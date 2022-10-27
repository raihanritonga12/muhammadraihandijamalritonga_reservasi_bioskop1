package com.binarchallenge4.demo.service.impl;

import com.binarchallenge4.demo.Entity.ContohEntity;
import com.binarchallenge4.demo.service.ContohService;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.*;
import org.springframework.stereotype.Service;
import java.io.InputStream;
import java.util.HashMap;

@Slf4j
@Service
public class ContohServiceImpl implements ContohService {


    @Override
    public ContohEntity generateLaporan(String filename) throws JRException {

        HashMap<String, Object> data = new HashMap<>();
        data.put("id","1");
        data.put("nama","Nemo");
        data.put("nama_film","Haikyuu The Movie: Battle of Concept");
        data.put("harga","Rp30.000,00");
        data.put("studio","Studio 1");
        data.put("kursi","D-5");
        data.put("jadwal","28/10/2022 , Pukul 10.00 WIB");
        InputStream ReportStream = getClass().getResourceAsStream("/Laporan.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(ReportStream);

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, data);
        byte[] file = JasperExportManager.exportReportToPdf(jasperPrint);
        ContohEntity database = new ContohEntity();
        database.setData(file);
        database.setNamaFile(filename);
        database.setTipeDataFile("application/pdf");
        return database;
    }
}




