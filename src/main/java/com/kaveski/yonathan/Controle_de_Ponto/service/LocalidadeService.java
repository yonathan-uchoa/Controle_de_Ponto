package com.kaveski.yonathan.Controle_de_Ponto.service;


import com.kaveski.yonathan.Controle_de_Ponto.model.Localidade;
import com.kaveski.yonathan.Controle_de_Ponto.repository.LocalidadeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@Controller
public class LocalidadeService {

    LocalidadeRepository localidadeRepository;

    public Localidade save(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public List<Localidade> findAll() {
        return localidadeRepository.findAll();
    }

    public Localidade findById(Long id) throws Exception {
        return verifyIfExist(id);
    }

    public Localidade update(Long id, Localidade localidade) throws Exception {
        verifyIfExist(id);
        localidade.setId(id);
        return localidadeRepository.save(localidade);
    }

    public void delete(Long id) throws Exception {
        verifyIfExist(id);
        localidadeRepository.deleteById(id);
    }

    private Localidade verifyIfExist(Long id) throws Exception {
        return localidadeRepository.findById(id).orElseThrow(()->
                new Exception("Localidade nao Encontrada")
        );
    }
}
