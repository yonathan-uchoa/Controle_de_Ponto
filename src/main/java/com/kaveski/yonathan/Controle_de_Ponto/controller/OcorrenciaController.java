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

    @GetMapping("/{idOcorrencia}")
    public Ocorrencia getOcorrenciaById(@PathVariable("idOcorrencia") Long idOcorrencia) throws Exception {
        return ocorrenciaService.findById(idOcorrencia);
    }

    @PutMapping("/{idOcorrencia}")
    public Ocorrencia updateOcorrencia(@PathVariable("idOcorrencia") Long idOcorrencia, @RequestBody Ocorrencia ocorrencia) throws Exception{
        return ocorrenciaService.update(idOcorrencia, ocorrencia);
    }

    @DeleteMapping("/{idOcorrencia}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOcorrencia(@PathVariable("idOcorrencia") Long idOcorrencia) throws Exception {
        ocorrenciaService.delete(idOcorrencia);
    }
}
