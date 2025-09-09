package com.encomendas.projetoencomendas.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
// @EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="funcionarios")
@PrimaryKeyJoinColumn(name="idpessoa")
public class FuncionarioEntity extends PessoaEntity {
    private String cargo;
}