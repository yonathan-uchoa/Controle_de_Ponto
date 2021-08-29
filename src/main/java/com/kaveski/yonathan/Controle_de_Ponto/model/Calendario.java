package com.kaveski.yonathan.Controle_de_Ponto.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    @Column
    private String descricao;
    @Column
    private LocalDateTime dataEspecial;
}
