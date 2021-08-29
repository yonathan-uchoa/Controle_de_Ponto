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
public class BancoHoras {
        @Embeddable
    @Data
    public class BancoHorasId implements Serializable{
        public Long idBancoHoras;
        public Long idMovimento;
        public Long idUsuario;
    }
    @EmbeddedId
    @Id
    private BancoHorasId id;
    @Column
    private LocalDateTime dataTrabalhada;
    @Column
    private BigDecimal horasTrabalhadas;
    @Column
    private BigDecimal saldoHoras;


}
