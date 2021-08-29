package com.kaveski.yonathan.Controle_de_Ponto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentacao {

    @Embeddable
    @Data
    public class MovimentacaoId implements Serializable {
        private long idMovimento;
        private long idUsuario;

    }
    @Id
    @EmbeddedId
    private MovimentacaoId id;
    @Column
    private LocalDateTime dataEntrada;
    @Column
    private LocalDateTime dataSaida;
    @Column
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;

}
