package com.wsoap.data.repository;

import com.wsoap.data.entity.Contribuyente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContribuyenteRepository extends JpaRepository<Contribuyente, String> {

    Contribuyente findByRucId(String ruc);
}