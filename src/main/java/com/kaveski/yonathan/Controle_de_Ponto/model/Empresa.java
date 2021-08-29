package com.kaveski.yonathan.Controle_de_Ponto.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Empresa {
    @Id
    private Long id;
    @Column
    private String descricao;
    @Column
    private String cnpj;
    @Column
    private String endereco;
    @Column
    private String bairro;
    @Column
    private String cidade;
    @Column
    private String estado;
    @Column
    private String telefone;

}
