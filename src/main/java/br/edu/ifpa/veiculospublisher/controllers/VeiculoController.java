package br.edu.ifpa.veiculospublisher.controllers;

import br.edu.ifpa.veiculospublisher.models.dtos.VeiculoDto;
import br.edu.ifpa.veiculospublisher.services.VeiculoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/veiculo")
public class VeiculoController {

    private VeiculoService service;

    public VeiculoController(VeiculoService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Void> enviarVeiculo(@RequestBody VeiculoDto obj) {
        try {
            service.enviarMsg(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
