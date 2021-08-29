package com.kaveski.yonathan.Controle_de_Ponto.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
