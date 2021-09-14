package com.kaveski.yonathan.Controle_de_Ponto.repository;

import com.kaveski.yonathan.Controle_de_Ponto.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
