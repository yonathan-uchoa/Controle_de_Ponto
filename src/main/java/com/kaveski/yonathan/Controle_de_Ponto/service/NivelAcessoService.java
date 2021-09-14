package com.kaveski.yonathan.Controle_de_Ponto.service;

import com.kaveski.yonathan.Controle_de_Ponto.model.Localidade;
import com.kaveski.yonathan.Controle_de_Ponto.model.NivelAcesso;
import com.kaveski.yonathan.Controle_de_Ponto.repository.NivelAcessoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@Controller
public class NivelAcessoService {

    NivelAcessoRepository nivelAcessoRepository;

    public  NivelAcesso save(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    public NivelAcesso findById(Long id) throws Exception {
        return verifyIfExist(id);
    }

    public NivelAcesso update(Long id, NivelAcesso nivelAcesso) throws Exception {
        verifyIfExist(id);
        nivelAcesso.setId(id);
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public void delete(Long id) throws Exception {
        verifyIfExist(id);
        nivelAcessoRepository.deleteById(id);
    }

    private NivelAcesso verifyIfExist(Long id) throws Exception {
        return nivelAcessoRepository.findById(id).orElseThrow(()->
                new Exception("Nivel de Acesso nao Encontrada")
        );
    }
}
