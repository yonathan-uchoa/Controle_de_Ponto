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
    public Empresa createCategoriaUsuario(@RequestBody Empresa empresa){
        return empresaService.save(empresa);
    }

    @GetMapping
    public List<Empresa> getCategoriaUsuarioList(){
        return empresaService.findAll();
    }

    @GetMapping("/{id}")
    public Empresa getCategoriaUsuarioById(@PathVariable("id") Long id) throws Exception {
        return empresaService.findById(id);
    }

    @PutMapping("/{id}")
    public Empresa updateCategoriaUsuario(@PathVariable("id") Long id, @RequestBody Empresa empresa) throws Exception{
        return empresaService.update(id, empresa);
    }
    @DeleteMapping("/{id}")
    public void deleteCategoriaUsuario(@PathVariable("id") Long id) throws Exception{
        empresaService.delete(id);
    }
}
