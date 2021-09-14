package com.kaveski.yonathan.Controle_de_Ponto.repository;

import com.kaveski.yonathan.Controle_de_Ponto.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {
}
