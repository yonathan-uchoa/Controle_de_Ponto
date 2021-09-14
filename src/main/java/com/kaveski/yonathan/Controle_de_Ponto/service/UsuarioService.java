package com.kaveski.yonathan.Controle_de_Ponto.service;

import com.kaveski.yonathan.Controle_de_Ponto.model.Ocorrencia;
import com.kaveski.yonathan.Controle_de_Ponto.model.Usuario;
import com.kaveski.yonathan.Controle_de_Ponto.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) throws Exception{
        return verifyIfExist(id);
    }

    public Usuario update(Long id, Usuario usuario) throws Exception {
        verifyIfExist(id);
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public void delete(Long idOcorrencia) throws Exception{
        verifyIfExist(idOcorrencia);
        usuarioRepository.deleteById(idOcorrencia);
    }

    private Usuario verifyIfExist(Long id) throws Exception {
        return usuarioRepository.findById(id).orElseThrow(()->
                new Exception("Ocorrencia nao Encontrada")
        );
    }
}
