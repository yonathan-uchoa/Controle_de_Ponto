package com.kaveski.yonathan.Controle_de_Ponto.controller;


import com.kaveski.yonathan.Controle_de_Ponto.model.JornadaTrabalho;
import com.kaveski.yonathan.Controle_de_Ponto.repository.JornadaTrabalhoRepository;
import com.kaveski.yonathan.Controle_de_Ponto.service.JornadaTrabalhoService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
    @Autowired
    private JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.save(jornadaTrabalho);
    }
    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{idJornada}")
    public JornadaTrabalho getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return jornadaTrabalhoService.findById(idJornada);
    }

    @PutMapping("/{idJornada}")
    public JornadaTrabalho updateJornada(@PathVariable("idJornada") Long idJornada, @RequestBody JornadaTrabalho jornadaTrabalho) throws Exception{
        return jornadaTrabalhoService.update(idJornada, jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteJornada(@PathVariable("idJornada") Long idJornada) throws Exception{
        jornadaTrabalhoService.delete(idJornada);
    }
}
