package com.example.storestock.services;

import com.example.storestock.models.Sales;
import com.example.storestock.repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {
    @Autowired
    private SalesRepository salesRepository;

    public List<Sales> findAll() {
        return salesRepository.findAll();
    }

    public void save(Sales sale) {
        salesRepository.save(sale);
    }
}
