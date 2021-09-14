package com.kaveski.yonathan.Controle_de_Ponto.repository;

import com.kaveski.yonathan.Controle_de_Ponto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
