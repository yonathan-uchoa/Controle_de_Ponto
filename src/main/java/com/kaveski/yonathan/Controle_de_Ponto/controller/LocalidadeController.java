package com.kaveski.yonathan.Controle_de_Ponto.controller;

import com.kaveski.yonathan.Controle_de_Ponto.model.Localidade;
import com.kaveski.yonathan.Controle_de_Ponto.model.Ocorrencia;
import com.kaveski.yonathan.Controle_de_Ponto.service.LocalidadeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/localidade")
public class LocalidadeController {
    LocalidadeService localidadeService;

    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade localidade){
        return localidadeService.save(localidade);
    }

    @GetMapping
    public List<Localidade> getLocalidadeList(){
        return localidadeService.findAll();
    }

    @GetMapping("/{id}")
    public Localidade getLocalidadeById(@PathVariable("id") Long id) throws Exception {
        return localidadeService.findById(id);
    }

    @PutMapping("/{id}")
    public Localidade updateLocalidade(@PathVariable("id") Long id, @RequestBody Localidade localidade) throws Exception{
        return localidadeService.update(id, localidade);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteLocalidade(@PathVariable("id") Long id) throws Exception {
        localidadeService.delete(id);
    }
}
