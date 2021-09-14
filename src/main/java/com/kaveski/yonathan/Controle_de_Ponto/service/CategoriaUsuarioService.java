package com.kaveski.yonathan.Controle_de_Ponto.service;

import com.kaveski.yonathan.Controle_de_Ponto.model.CategoriaUsuario;
import com.kaveski.yonathan.Controle_de_Ponto.model.Ocorrencia;
import com.kaveski.yonathan.Controle_de_Ponto.repository.CategoriaUsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@Controller
public class CategoriaUsuarioService {
    CategoriaUsuarioRepository categoriaUsuarioRepository;

    public CategoriaUsuario save(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public List<CategoriaUsuario> findAll() {
        return categoriaUsuarioRepository.findAll();
    }

    public CategoriaUsuario findById(Long idOcorrencia) throws Exception{
        return verifyIfExist(idOcorrencia);
    }

    public CategoriaUsuario update(Long idCategoriaUsuario, CategoriaUsuario categoriaUsuario) throws Exception {
        verifyIfExist(idCategoriaUsuario);
        categoriaUsuario.setId(idCategoriaUsuario);
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public void delete(Long idOcorrencia) throws Exception{
        verifyIfExist(idOcorrencia);
        categoriaUsuarioRepository.deleteById(idOcorrencia);
    }

    private CategoriaUsuario verifyIfExist(Long id) throws Exception {
        return categoriaUsuarioRepository.findById(id).orElseThrow(()->
                new Exception("Categoria de Usuario nao Encontrada")
        );
    }
}
