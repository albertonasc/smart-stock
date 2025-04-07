package com.demo.smartstock.service;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SmartStockService {

    private final ReportService reportService;

    public SmartStockService(ReportService reportService) {
        this.reportService = reportService;
    }

    public void start(String reportPath) {

        // 1. Ler o arquivo csv
        try {

            var items = reportService.readStockReport(reportPath);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // 2. Para cada item do csv chamar a api do setor de compras


        // 3. Salvar no mongodb os itens que foram recomprados


    }

}
