package com.example.storestock.controllers;

import com.example.storestock.models.Sales;
import com.example.storestock.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
public class SalesController {
    @Autowired
    private SalesService salesService;

    @GetMapping
    public List<Sales> getAllSales() {
        return salesService.findAll();
    }

    @PostMapping
    public void addSale(@RequestBody Sales sale) {
        salesService.save(sale);
    }
}
