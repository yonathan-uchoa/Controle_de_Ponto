package com.kaveski.yonathan.Controle_de_Ponto.controller;

import com.kaveski.yonathan.Controle_de_Ponto.model.NivelAcesso;
import com.kaveski.yonathan.Controle_de_Ponto.model.Ocorrencia;
import com.kaveski.yonathan.Controle_de_Ponto.service.NivelAcessoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/nivel-acesso")
@RestController
public class NivelAcessoController {

    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.save(nivelAcesso);
    }

    @GetMapping
    public List<NivelAcesso> getNivelAcessoList(){
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{id}")
    public NivelAcesso getNivelAcessoById(@PathVariable("id") Long id) throws Exception {
        return nivelAcessoService.findById(id);
    }

    @PutMapping("/{id}")
    public NivelAcesso updateNivelAcesso(@PathVariable("id") Long id, @RequestBody NivelAcesso nivelAcesso) throws Exception{
        return nivelAcessoService.update(id, nivelAcesso);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOcorrencia(@PathVariable("id") Long id) throws Exception {
        nivelAcessoService.delete(id);
    }
}
