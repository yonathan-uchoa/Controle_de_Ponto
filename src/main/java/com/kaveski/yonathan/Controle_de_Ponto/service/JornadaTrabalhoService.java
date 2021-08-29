package com.kaveski.yonathan.Controle_de_Ponto.service;

import com.kaveski.yonathan.Controle_de_Ponto.model.JornadaTrabalho;
import com.kaveski.yonathan.Controle_de_Ponto.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    @Autowired
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> findById(Long idJornada) {
        return jornadaTrabalhoRepository.findById(idJornada);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void delete(Long idJornada) {
        jornadaTrabalhoRepository.deleteById(idJornada);
    }
}
