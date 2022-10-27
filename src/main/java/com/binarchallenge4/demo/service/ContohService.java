package com.binarchallenge4.demo.service;

import com.binarchallenge4.demo.Entity.ContohEntity;
import com.lowagie.text.DocumentException;
import net.sf.jasperreports.engine.JRException;
import java.io.FileNotFoundException;

public interface ContohService {
    ContohEntity generateLaporan(String filename) throws JRException, DocumentException, FileNotFoundException;
}
