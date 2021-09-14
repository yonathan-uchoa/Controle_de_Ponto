package com.kaveski.yonathan.Controle_de_Ponto.service;

import com.kaveski.yonathan.Controle_de_Ponto.model.JornadaTrabalho;
import com.kaveski.yonathan.Controle_de_Ponto.model.Ocorrencia;
import com.kaveski.yonathan.Controle_de_Ponto.repository.JornadaTrabalhoRepository;
import com.kaveski.yonathan.Controle_de_Ponto.repository.OcorrenciaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class OcorrenciaService {

    OcorrenciaRepository ocorrenciaRepository;

    public Ocorrencia save(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }

    public Ocorrencia findById(Long idOcorrencia) throws Exception{
        return verifyIfExist(idOcorrencia);
    }

    public Ocorrencia update(Long idOcorrencia, Ocorrencia ocorrencia) throws Exception {
        verifyIfExist(idOcorrencia);
        ocorrencia.setId(idOcorrencia);
        return ocorrenciaRepository.save(ocorrencia);
    }

    public void delete(Long idOcorrencia) throws Exception{
        verifyIfExist(idOcorrencia);
        ocorrenciaRepository.deleteById(idOcorrencia);
    }

    private Ocorrencia verifyIfExist(Long id) throws Exception {
        return ocorrenciaRepository.findById(id).orElseThrow(()->
                new Exception("Ocorrencia nao Encontrada")
        );
    }
}
