package com.kaveski.yonathan.Controle_de_Ponto.controller;


import com.kaveski.yonathan.Controle_de_Ponto.model.CategoriaUsuario;
import com.kaveski.yonathan.Controle_de_Ponto.service.CategoriaUsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/usuario/categoria")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CategoriaUsuarioController {

    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario createCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.save(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getCategoriaUsuarioList(){
        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{id}")
    public CategoriaUsuario getCategoriaUsuarioById(@PathVariable("id") Long id) throws Exception {
        return categoriaUsuarioService.findById(id);
    }

    @PutMapping("/{id}")
    public CategoriaUsuario updateCategoriaUsuario(@PathVariable("id") Long id, @RequestBody CategoriaUsuario categoriaUsuario) throws Exception{
        return categoriaUsuarioService.update(id, categoriaUsuario);
    }
    @DeleteMapping("/{id}")
    public void deleteCategoriaUsuario(@PathVariable("id") Long id) throws Exception{
        categoriaUsuarioService.delete(id);
    }
}
