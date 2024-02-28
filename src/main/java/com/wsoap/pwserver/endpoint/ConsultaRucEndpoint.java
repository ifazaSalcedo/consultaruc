package com.wsoap.pwserver.endpoint;

import com.wsoap.data.entity.Contribuyente;
import com.wsoap.data.service.ContribuyenteService;
import com.wsoap.pwserver.consulta.ConsultaRucRequest;
import com.wsoap.pwserver.consulta.ConsultaRucResponse;
import com.wsoap.pwserver.consulta.RucContribuyente;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ConsultaRucEndpoint {
    private static final String NAMESPACE_URI= "http://wsoap.com/pwserver/consulta";

    private ContribuyenteService contribuyenteService;

    @Autowired
    public ConsultaRucEndpoint(ContribuyenteService contribuyenteService) {
        this.contribuyenteService = contribuyenteService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "consultaRucRequest")
    @ResponsePayload
    public ConsultaRucResponse consultaRucResponse(@RequestPayload ConsultaRucRequest request){
        ConsultaRucResponse response= new ConsultaRucResponse();
        RucContribuyente rucContribuyente= new RucContribuyente();
        Contribuyente contribuyente = contribuyenteService.getContribuyenteByRuc(request.getRucParamentro());
        BeanUtils.copyProperties(contribuyente, rucContribuyente);
        response.setRucContribuyente(rucContribuyente);
        return response;
    }
}
