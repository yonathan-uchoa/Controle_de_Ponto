package com.kaveski.yonathan.Controle_de_Ponto.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

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
@IdClass(MovimentacaoId.class)
public class Movimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Usuario usuario;

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

@Data
class MovimentacaoId implements Serializable {
    private long id;
    private Usuario usuario;

}
