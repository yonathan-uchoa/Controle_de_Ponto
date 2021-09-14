package com.kaveski.yonathan.Controle_de_Ponto.controller;


import com.kaveski.yonathan.Controle_de_Ponto.model.JornadaTrabalho;
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

    @GetMapping("/{id}")
    public JornadaTrabalho getJornadaById(@PathVariable("id") Long id) throws Exception {
        return jornadaTrabalhoService.findById(id);
    }

    @PutMapping("/{id}")
    public JornadaTrabalho updateJornada(@PathVariable("id") Long id, @RequestBody JornadaTrabalho jornadaTrabalho) throws Exception{
        return jornadaTrabalhoService.update(id, jornadaTrabalho);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteJornada(@PathVariable("id") Long id) throws Exception{
        jornadaTrabalhoService.delete(id);
    }
}
