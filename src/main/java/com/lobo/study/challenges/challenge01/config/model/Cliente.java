package com.lobo.study.challenges.challenge01.config.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "cliente",
            cascade = CascadeType.ALL
    )
    private List<Transacao> transacoes;

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", transacoes=" + transacoes +
                '}';
    }
}
