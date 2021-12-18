package br.edu.ifpa.veiculospublisher.services;

import br.edu.ifpa.veiculospublisher.models.dtos.VeiculoDto;
import br.edu.ifpa.veiculospublisher.publisher.VeiculoPublisher;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

    private VeiculoPublisher publisher;

    public VeiculoService(VeiculoPublisher publisher){
        this.publisher = publisher;
    }

    public void enviarMsg(VeiculoDto obj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        publisher.send(mapper.writeValueAsString(obj));
        System.out.println(mapper.writeValueAsString(obj));
    }
}
