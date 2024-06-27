package com.example.storestock.repositories;

import com.example.storestock.models.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Long> {}
