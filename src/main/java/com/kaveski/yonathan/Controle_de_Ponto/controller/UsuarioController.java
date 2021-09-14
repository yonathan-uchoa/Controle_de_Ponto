package com.kaveski.yonathan.Controle_de_Ponto.controller;

import com.kaveski.yonathan.Controle_de_Ponto.model.Empresa;
import com.kaveski.yonathan.Controle_de_Ponto.model.Usuario;
import com.kaveski.yonathan.Controle_de_Ponto.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UsuarioController {
    UsuarioService usuarioService;

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @GetMapping
    public List<Usuario> getUsuarioList(){
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable("id") Long id) throws Exception {
        return usuarioService.findById(id);
    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable("id") Long id, @RequestBody Usuario usuario) throws Exception{
        return usuarioService.update(id, usuario);
    }
    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable("id") Long id) throws Exception{
        usuarioService.delete(id);
    }
}
