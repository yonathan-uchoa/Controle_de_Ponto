package com.kaveski.yonathan.Controle_de_Ponto.service;

import com.kaveski.yonathan.Controle_de_Ponto.model.Empresa;
import com.kaveski.yonathan.Controle_de_Ponto.model.JornadaTrabalho;
import com.kaveski.yonathan.Controle_de_Ponto.repository.EmpresaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmpresaService {
    EmpresaRepository empresaRepository;

    public Empresa save(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Empresa findById(Long id) throws Exception {
        return verifyIfExist(id);
    }

    public Empresa update(Long id, Empresa empresa) throws Exception {
        verifyIfExist(id);
        empresa.setId(id);
        return empresaRepository.save(empresa);
    }

    public void delete(Long id) throws Exception {
        verifyIfExist(id);
        empresaRepository.deleteById(id);
    }

    private Empresa verifyIfExist(Long id) throws Exception {
        return empresaRepository.findById(id).orElseThrow(()->
                new Exception("Empresa nao Encontrada")
        );
    }
}
