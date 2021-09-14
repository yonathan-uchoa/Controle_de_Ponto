package com.kaveski.yonathan.Controle_de_Ponto.service;

import com.kaveski.yonathan.Controle_de_Ponto.model.JornadaTrabalho;
import com.kaveski.yonathan.Controle_de_Ponto.repository.JornadaTrabalhoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class JornadaTrabalhoService {

    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }

    public JornadaTrabalho findById(Long idJornada) throws Exception {
        return verifyIfExist(idJornada);
    }

    public JornadaTrabalho update(Long idJornada, JornadaTrabalho jornadaTrabalho) throws Exception {
        verifyIfExist(idJornada);
//        jornadaTrabalho.setId(idJornada);
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void delete(Long idJornada) throws Exception {
        verifyIfExist(idJornada);
        jornadaTrabalhoRepository.deleteById(idJornada);
    }

    private JornadaTrabalho verifyIfExist(Long id) throws Exception {
        return jornadaTrabalhoRepository.findById(id).orElseThrow(()->
                new Exception("Jornada nao Encontrada")
        );
    }
}
