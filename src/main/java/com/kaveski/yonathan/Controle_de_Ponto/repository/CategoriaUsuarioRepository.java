package com.kaveski.yonathan.Controle_de_Ponto.repository;


import com.kaveski.yonathan.Controle_de_Ponto.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {
}
