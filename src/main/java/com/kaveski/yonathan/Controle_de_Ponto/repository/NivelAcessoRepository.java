package com.kaveski.yonathan.Controle_de_Ponto.repository;

import com.kaveski.yonathan.Controle_de_Ponto.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {
}
