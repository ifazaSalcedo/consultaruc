package com.wsoap.data.service;

import com.wsoap.data.entity.Contribuyente;
import com.wsoap.data.repository.ContribuyenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContribuyenteService {
    @Autowired
    private ContribuyenteRepository contribuyenteRepository;

    public Contribuyente getContribuyenteByRuc(String ruc){

        return contribuyenteRepository.findByRucId(ruc);
    }

}
