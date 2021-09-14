package com.kaveski.yonathan.Controle_de_Ponto.controller;

import com.kaveski.yonathan.Controle_de_Ponto.model.Empresa;
import com.kaveski.yonathan.Controle_de_Ponto.service.EmpresaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmpresaController {
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaService.save(empresa);
    }

    @GetMapping
    public List<Empresa> getEmpresaList(){
        return empresaService.findAll();
    }

    @GetMapping("/{id}")
    public Empresa getEmpresaById(@PathVariable("id") Long id) throws Exception {
        return empresaService.findById(id);
    }

    @PutMapping("/{id}")
    public Empresa updateEmpresa(@PathVariable("id") Long id, @RequestBody Empresa empresa) throws Exception{
        return empresaService.update(id, empresa);
    }
    @DeleteMapping("/{id}")
    public void deleteEmpresa(@PathVariable("id") Long id) throws Exception{
        empresaService.delete(id);
    }
}
