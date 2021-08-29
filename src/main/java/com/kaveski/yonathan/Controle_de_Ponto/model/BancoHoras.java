package com.kaveski.yonathan.Controle_de_Ponto.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "BancoHoras")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

//Escolhi ID class por conta do GeneratedValue, nao estava conseguindo com Embedded.
@IdClass(BancoHorasId.class)
public class BancoHoras {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Movimentacao movimentacao;
    @Column
    private LocalDateTime dataTrabalhada;
    @Column
    private BigDecimal horasTrabalhadas;
    @Column
    private BigDecimal saldoHoras;
}
@Data
class BancoHorasId implements Serializable{
    private Long id;
    private Movimentacao movimentacao;
}


