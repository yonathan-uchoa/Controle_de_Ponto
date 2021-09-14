package com.kaveski.yonathan.Controle_de_Ponto.controller;

import com.kaveski.yonathan.Controle_de_Ponto.model.Ocorrencia;
import com.kaveski.yonathan.Controle_de_Ponto.service.OcorrenciaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class OcorrenciaController {
    private OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.save(ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> getJornadaList(){
        return ocorrenciaService.findAll();
    }

    @GetMapping("/{id}")
    public Ocorrencia getOcorrenciaById(@PathVariable("id") Long id) throws Exception {
        return ocorrenciaService.findById(id);
    }

    @PutMapping("/{id}")
    public Ocorrencia updateOcorrencia(@PathVariable("id") Long id, @RequestBody Ocorrencia ocorrencia) throws Exception{
        return ocorrenciaService.update(id, ocorrencia);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOcorrencia(@PathVariable("id") Long id) throws Exception {
        ocorrenciaService.delete(id);
    }
}
