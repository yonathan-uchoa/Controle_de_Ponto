package com.kaveski.yonathan.Controle_de_Ponto.controller;


import com.kaveski.yonathan.Controle_de_Ponto.model.JornadaTrabalho;
import com.kaveski.yonathan.Controle_de_Ponto.service.JornadaTrabalhoService;

import org.springframework.beans.factory.annotation.Autowired;

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
        return jornadaTrabalhoService.findById(idJornada).orElseThrow(() ->
                new Exception("Jornada nao encontrada!")
        );
    }


}
